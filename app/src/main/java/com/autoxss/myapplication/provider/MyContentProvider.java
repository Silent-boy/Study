package com.autoxss.myapplication.provider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;
import android.support.annotation.Nullable;

import com.autoxss.myapplication.dbmanager.DbManager;

/**
 * Created by Huihui on 2017/5/31.
 */
public class MyContentProvider extends ContentProvider {
    private static UriMatcher uriMatcher = new UriMatcher(UriMatcher.NO_MATCH);
    private static int QUERY = 1;
    private DbManager db;

    static {
        uriMatcher.addURI("com.autoxss.myapplication.mycontentprovder", "query", QUERY);
    }

    @Override
    public boolean onCreate() {
        db = new DbManager(getContext());
        return false;
    }

    @Nullable
    @Override
    public Cursor query(Uri uri, String[] projection, String selection, String[] selectionArgs, String sortOrder) {
        if (uriMatcher.match(uri) == QUERY) {
            return db.query();
        }
        return null;
    }

    @Nullable
    @Override
    public String getType(Uri uri) {
        return null;
    }

    @Nullable
    @Override
    public Uri insert(Uri uri, ContentValues values) {
        return null;
    }

    @Override
    public int delete(Uri uri, String selection, String[] selectionArgs) {
        return 0;
    }

    @Override
    public int update(Uri uri, ContentValues values, String selection, String[] selectionArgs) {
        return 0;
    }
}
