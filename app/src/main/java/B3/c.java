package B3;

import Lg.n;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import id.AbstractC3557B;
import io.sentry.android.core.AbstractC3612c;
import java.io.File;

/* loaded from: classes2.dex */
public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    public final int f1830a;

    public c(int i10) {
        this.f1830a = i10;
    }

    public static void a(String str) {
        int i10;
        boolean z10;
        if (!n.f2(str, ":memory:")) {
            int length = str.length() - 1;
            int i11 = 0;
            boolean z11 = false;
            while (i11 <= length) {
                if (!z11) {
                    i10 = i11;
                } else {
                    i10 = length;
                }
                if (AbstractC3557B.e0(str.charAt(i10), 32) <= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z11) {
                    if (!z10) {
                        z11 = true;
                    } else {
                        i11++;
                    }
                } else if (!z10) {
                    break;
                } else {
                    length--;
                }
            }
            if (str.subSequence(i11, length + 1).toString().length() != 0) {
                AbstractC3612c.r("SupportSQLite", "deleting the database file: ".concat(str));
                try {
                    SQLiteDatabase.deleteDatabase(new File(str));
                } catch (Exception e10) {
                    AbstractC3612c.s("SupportSQLite", "delete failed: ", e10);
                }
            }
        }
    }

    public abstract void c(C3.b bVar);

    public void d(C3.b bVar, int i10, int i11) {
        throw new SQLiteException(AbstractC2469q0.i("Can't downgrade database from version ", i10, " to ", i11));
    }

    public abstract void e(C3.b bVar);

    public abstract void f(C3.b bVar, int i10, int i11);

    public void b(C3.b bVar) {
    }
}
