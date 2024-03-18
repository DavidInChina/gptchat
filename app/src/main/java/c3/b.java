package C3;

import B2.u;
import B3.h;
import B3.i;
import F.C0534h;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.gov.nist.core.Separators;
import android.os.CancellationSignal;
import android.text.TextUtils;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import id.AbstractC3557B;
import io.sentry.C1;
import io.sentry.L0;
import io.sentry.S;
import x3.w;

/* loaded from: classes2.dex */
public final class b implements B3.b {

    /* renamed from: Z  reason: collision with root package name */
    public static final String[] f2643Z = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    /* renamed from: h0  reason: collision with root package name */
    public static final String[] f2644h0 = new String[0];

    /* renamed from: Y  reason: collision with root package name */
    public final SQLiteDatabase f2645Y;

    public b(SQLiteDatabase sQLiteDatabase) {
        AbstractC3557B.c0("delegate", sQLiteDatabase);
        this.f2645Y = sQLiteDatabase;
    }

    @Override // B3.b
    public final boolean B0() {
        SQLiteDatabase sQLiteDatabase = this.f2645Y;
        AbstractC3557B.c0("sQLiteDatabase", sQLiteDatabase);
        return sQLiteDatabase.isWriteAheadLoggingEnabled();
    }

    @Override // B3.b
    public final void Q(boolean z10) {
        SQLiteDatabase sQLiteDatabase = this.f2645Y;
        AbstractC3557B.c0("sQLiteDatabase", sQLiteDatabase);
        sQLiteDatabase.setForeignKeyConstraintsEnabled(z10);
    }

    @Override // B3.b
    public final void U() {
        this.f2645Y.setTransactionSuccessful();
    }

    @Override // B3.b
    public final void W(String str, Object[] objArr) {
        S s10;
        S d10 = L0.d();
        if (d10 != null) {
            s10 = d10.v("db.sql.query", str);
        } else {
            s10 = null;
        }
        try {
            try {
                AbstractC3557B.c0("sql", str);
                AbstractC3557B.c0("bindArgs", objArr);
                this.f2645Y.execSQL(str, objArr);
                if (s10 != null) {
                    s10.c(C1.OK);
                }
            } catch (SQLException e10) {
                if (s10 != null) {
                    s10.c(C1.INTERNAL_ERROR);
                    s10.o(e10);
                }
                throw e10;
            }
        } finally {
            if (s10 != null) {
                s10.b();
            }
        }
    }

    @Override // B3.b
    public final void X() {
        this.f2645Y.beginTransactionNonExclusive();
    }

    @Override // B3.b
    public final int Y(String str, int i10, ContentValues contentValues, String str2, Object[] objArr) {
        int i11;
        String str3;
        AbstractC3557B.c0("table", str);
        AbstractC3557B.c0(DiagnosticsEntry.Histogram.VALUES_KEY, contentValues);
        if (contentValues.size() != 0) {
            int size = contentValues.size();
            if (objArr == null) {
                i11 = size;
            } else {
                i11 = objArr.length + size;
            }
            Object[] objArr2 = new Object[i11];
            StringBuilder sb2 = new StringBuilder("UPDATE ");
            sb2.append(f2643Z[i10]);
            sb2.append(str);
            sb2.append(" SET ");
            int i12 = 0;
            for (String str4 : contentValues.keySet()) {
                if (i12 > 0) {
                    str3 = Separators.COMMA;
                } else {
                    str3 = "";
                }
                sb2.append(str3);
                sb2.append(str4);
                objArr2[i12] = contentValues.get(str4);
                sb2.append("=?");
                i12++;
            }
            if (objArr != null) {
                for (int i13 = size; i13 < i11; i13++) {
                    objArr2[i13] = objArr[i13 - size];
                }
            }
            if (!TextUtils.isEmpty(str2)) {
                sb2.append(" WHERE ");
                sb2.append(str2);
            }
            String sb3 = sb2.toString();
            AbstractC3557B.b0("StringBuilder().apply(builderAction).toString()", sb3);
            i x10 = x(sb3);
            u.s((w) x10, objArr2);
            return ((g) x10).w();
        }
        throw new IllegalArgumentException("Empty values".toString());
    }

    public final boolean a() {
        return this.f2645Y.enableWriteAheadLogging();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f2645Y.close();
    }

    public final Cursor h(String str) {
        AbstractC3557B.c0("query", str);
        return x0(new B3.a(str));
    }

    @Override // B3.b
    public final boolean isOpen() {
        return this.f2645Y.isOpen();
    }

    @Override // B3.b
    public final void j0() {
        this.f2645Y.endTransaction();
    }

    @Override // B3.b
    public final void n() {
        this.f2645Y.beginTransaction();
    }

    @Override // B3.b
    public final void s(int i10) {
        this.f2645Y.setVersion(i10);
    }

    @Override // B3.b
    public final void t(String str) {
        S s10;
        S d10 = L0.d();
        if (d10 != null) {
            s10 = d10.v("db.sql.query", str);
        } else {
            s10 = null;
        }
        try {
            try {
                AbstractC3557B.c0("sql", str);
                this.f2645Y.execSQL(str);
                if (s10 != null) {
                    s10.c(C1.OK);
                }
            } catch (SQLException e10) {
                if (s10 != null) {
                    s10.c(C1.INTERNAL_ERROR);
                    s10.o(e10);
                }
                throw e10;
            }
        } finally {
            if (s10 != null) {
                s10.b();
            }
        }
    }

    @Override // B3.b
    public final i x(String str) {
        AbstractC3557B.c0("sql", str);
        SQLiteStatement compileStatement = this.f2645Y.compileStatement(str);
        AbstractC3557B.b0("delegate.compileStatement(sql)", compileStatement);
        return new g(compileStatement);
    }

    @Override // B3.b
    public final Cursor x0(h hVar) {
        S s10;
        S d10 = L0.d();
        if (d10 != null) {
            s10 = d10.v("db.sql.query", hVar.i());
        } else {
            s10 = null;
        }
        try {
            try {
                AbstractC3557B.c0("query", hVar);
                Cursor rawQueryWithFactory = this.f2645Y.rawQueryWithFactory(new a(1, new C0534h(3, hVar)), hVar.i(), f2644h0, null);
                AbstractC3557B.b0("delegate.rawQueryWithFac\u2026EMPTY_STRING_ARRAY, null)", rawQueryWithFactory);
                if (s10 != null) {
                    s10.c(C1.OK);
                }
                return rawQueryWithFactory;
            } catch (Exception e10) {
                if (s10 != null) {
                    s10.c(C1.INTERNAL_ERROR);
                    s10.o(e10);
                }
                throw e10;
            }
        } finally {
            if (s10 != null) {
                s10.b();
            }
        }
    }

    @Override // B3.b
    public final boolean y0() {
        return this.f2645Y.inTransaction();
    }

    @Override // B3.b
    public final Cursor z(h hVar, CancellationSignal cancellationSignal) {
        S s10;
        S d10 = L0.d();
        if (d10 != null) {
            s10 = d10.v("db.sql.query", hVar.i());
        } else {
            s10 = null;
        }
        try {
            try {
                SQLiteDatabase sQLiteDatabase = this.f2645Y;
                String i10 = hVar.i();
                String[] strArr = f2644h0;
                AbstractC3557B.Z(cancellationSignal);
                Cursor K10 = Gi.e.K(sQLiteDatabase, i10, strArr, cancellationSignal, new a(0, hVar));
                if (s10 != null) {
                    s10.c(C1.OK);
                }
                return K10;
            } catch (Exception e10) {
                if (s10 != null) {
                    s10.c(C1.INTERNAL_ERROR);
                    s10.o(e10);
                }
                throw e10;
            }
        } finally {
            if (s10 != null) {
                s10.b();
            }
        }
    }
}
