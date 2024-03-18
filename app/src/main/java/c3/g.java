package C3;

import B3.i;
import android.database.sqlite.SQLiteStatement;
import io.sentry.C1;
import io.sentry.L0;
import io.sentry.S;
import x3.w;

/* loaded from: classes2.dex */
public final class g extends w implements i {

    /* renamed from: h0  reason: collision with root package name */
    public final SQLiteStatement f2665h0;

    public g(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.f2665h0 = sQLiteStatement;
    }

    @Override // B3.i
    public final long N0() {
        S s10;
        SQLiteStatement sQLiteStatement = this.f2665h0;
        String sQLiteStatement2 = sQLiteStatement.toString();
        String substring = sQLiteStatement2.substring(sQLiteStatement2.indexOf(58) + 2);
        S d10 = L0.d();
        if (d10 != null) {
            s10 = d10.v("db.sql.query", substring);
        } else {
            s10 = null;
        }
        try {
            try {
                long executeInsert = sQLiteStatement.executeInsert();
                if (s10 != null) {
                    s10.c(C1.OK);
                }
                return executeInsert;
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

    @Override // B3.i
    public final int w() {
        S s10;
        SQLiteStatement sQLiteStatement = this.f2665h0;
        String sQLiteStatement2 = sQLiteStatement.toString();
        String substring = sQLiteStatement2.substring(sQLiteStatement2.indexOf(58) + 2);
        S d10 = L0.d();
        if (d10 != null) {
            s10 = d10.v("db.sql.query", substring);
        } else {
            s10 = null;
        }
        try {
            try {
                int executeUpdateDelete = sQLiteStatement.executeUpdateDelete();
                if (s10 != null) {
                    s10.c(C1.OK);
                }
                return executeUpdateDelete;
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
