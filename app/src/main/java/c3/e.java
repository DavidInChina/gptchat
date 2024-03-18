package C3;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Pair;
import id.AbstractC3557B;
import io.sentry.android.core.AbstractC3612c;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import z.AbstractC6708l;

/* loaded from: classes2.dex */
public final class e extends SQLiteOpenHelper {

    /* renamed from: m0  reason: collision with root package name */
    public static final /* synthetic */ int f2650m0 = 0;

    /* renamed from: Y  reason: collision with root package name */
    public final Context f2651Y;

    /* renamed from: Z  reason: collision with root package name */
    public final J0.a f2652Z;

    /* renamed from: h0  reason: collision with root package name */
    public final B3.c f2653h0;

    /* renamed from: i0  reason: collision with root package name */
    public final boolean f2654i0;

    /* renamed from: j0  reason: collision with root package name */
    public boolean f2655j0;

    /* renamed from: k0  reason: collision with root package name */
    public final D3.a f2656k0;

    /* renamed from: l0  reason: collision with root package name */
    public boolean f2657l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context, String str, final J0.a aVar, final B3.c cVar, boolean z10) {
        super(context, str, null, cVar.f1830a, new DatabaseErrorHandler() { // from class: C3.c
            @Override // android.database.DatabaseErrorHandler
            public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                AbstractC3557B.c0("$callback", B3.c.this);
                J0.a aVar2 = aVar;
                AbstractC3557B.c0("$dbRef", aVar2);
                int i10 = e.f2650m0;
                AbstractC3557B.b0("dbObj", sQLiteDatabase);
                b I10 = P5.c.I(aVar2, sQLiteDatabase);
                AbstractC3612c.c("SupportSQLite", "Corruption reported by sqlite on database: " + I10 + ".path");
                SQLiteDatabase sQLiteDatabase2 = I10.f2645Y;
                if (!sQLiteDatabase2.isOpen()) {
                    String path = sQLiteDatabase2.getPath();
                    if (path != null) {
                        B3.c.a(path);
                        return;
                    }
                    return;
                }
                List<Pair<String, String>> list = null;
                try {
                    try {
                        list = sQLiteDatabase2.getAttachedDbs();
                    } catch (SQLiteException unused) {
                    }
                    try {
                        I10.close();
                    } catch (IOException unused2) {
                    }
                } finally {
                    if (list != null) {
                        Iterator<T> it = list.iterator();
                        while (it.hasNext()) {
                            Object obj = ((Pair) it.next()).second;
                            AbstractC3557B.b0("p.second", obj);
                            B3.c.a((String) obj);
                        }
                    } else {
                        String path2 = sQLiteDatabase2.getPath();
                        if (path2 != null) {
                            B3.c.a(path2);
                        }
                    }
                }
            }
        });
        AbstractC3557B.c0("context", context);
        AbstractC3557B.c0("callback", cVar);
        this.f2651Y = context;
        this.f2652Z = aVar;
        this.f2653h0 = cVar;
        this.f2654i0 = z10;
        if (str == null) {
            str = UUID.randomUUID().toString();
            AbstractC3557B.b0("randomUUID().toString()", str);
        }
        this.f2656k0 = new D3.a(str, context.getCacheDir(), false);
    }

    public final B3.b a(boolean z10) {
        boolean z11;
        D3.a aVar = this.f2656k0;
        try {
            if (!this.f2657l0 && getDatabaseName() != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            aVar.a(z11);
            this.f2655j0 = false;
            SQLiteDatabase j6 = j(z10);
            if (this.f2655j0) {
                close();
                B3.b a5 = a(z10);
                aVar.b();
                return a5;
            }
            b h10 = h(j6);
            aVar.b();
            return h10;
        } catch (Throwable th2) {
            aVar.b();
            throw th2;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final void close() {
        D3.a aVar = this.f2656k0;
        try {
            aVar.a(aVar.f3337a);
            super.close();
            this.f2652Z.f8729Y = null;
            this.f2657l0 = false;
        } finally {
            aVar.b();
        }
    }

    public final b h(SQLiteDatabase sQLiteDatabase) {
        AbstractC3557B.c0("sqLiteDatabase", sQLiteDatabase);
        return P5.c.I(this.f2652Z, sQLiteDatabase);
    }

    public final SQLiteDatabase i(boolean z10) {
        if (z10) {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            AbstractC3557B.b0("{\n                super.\u2026eDatabase()\n            }", writableDatabase);
            return writableDatabase;
        }
        SQLiteDatabase readableDatabase = getReadableDatabase();
        AbstractC3557B.b0("{\n                super.\u2026eDatabase()\n            }", readableDatabase);
        return readableDatabase;
    }

    public final SQLiteDatabase j(boolean z10) {
        File parentFile;
        String databaseName = getDatabaseName();
        boolean z11 = this.f2657l0;
        Context context = this.f2651Y;
        if (databaseName != null && !z11 && (parentFile = context.getDatabasePath(databaseName).getParentFile()) != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                AbstractC3612c.r("SupportSQLite", "Invalid database parent file, not a directory: " + parentFile);
            }
        }
        try {
            return i(z10);
        } catch (Throwable unused) {
            super.close();
            try {
                Thread.sleep(500L);
            } catch (InterruptedException unused2) {
            }
            try {
                return i(z10);
            } catch (Throwable th2) {
                super.close();
                if (th2 instanceof d) {
                    d dVar = th2;
                    int f6 = AbstractC6708l.f(dVar.f2648Y);
                    Throwable th3 = dVar.f2649Z;
                    if (f6 != 0 && f6 != 1 && f6 != 2 && f6 != 3) {
                        if (!(th3 instanceof SQLiteException)) {
                            throw th3;
                        }
                    } else {
                        throw th3;
                    }
                } else if (th2 instanceof SQLiteException) {
                    if (databaseName == null || !this.f2654i0) {
                        throw th2;
                    }
                } else {
                    throw th2;
                }
                context.deleteDatabase(databaseName);
                try {
                    return i(z10);
                } catch (d e10) {
                    throw e10.f2649Z;
                }
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        AbstractC3557B.c0("db", sQLiteDatabase);
        boolean z10 = this.f2655j0;
        B3.c cVar = this.f2653h0;
        if (!z10 && cVar.f1830a != sQLiteDatabase.getVersion()) {
            sQLiteDatabase.setMaxSqlCacheSize(1);
        }
        try {
            cVar.b(h(sQLiteDatabase));
        } catch (Throwable th2) {
            throw new d(1, th2);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        AbstractC3557B.c0("sqLiteDatabase", sQLiteDatabase);
        try {
            this.f2653h0.c(h(sQLiteDatabase));
        } catch (Throwable th2) {
            throw new d(2, th2);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        AbstractC3557B.c0("db", sQLiteDatabase);
        this.f2655j0 = true;
        try {
            this.f2653h0.d(h(sQLiteDatabase), i10, i11);
        } catch (Throwable th2) {
            throw new d(4, th2);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        AbstractC3557B.c0("db", sQLiteDatabase);
        if (!this.f2655j0) {
            try {
                this.f2653h0.e(h(sQLiteDatabase));
            } catch (Throwable th2) {
                throw new d(5, th2);
            }
        }
        this.f2657l0 = true;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        AbstractC3557B.c0("sqLiteDatabase", sQLiteDatabase);
        this.f2655j0 = true;
        try {
            this.f2653h0.f(h(sQLiteDatabase), i10, i11);
        } catch (Throwable th2) {
            throw new d(3, th2);
        }
    }
}
