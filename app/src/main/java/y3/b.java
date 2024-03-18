package Y3;

import E9.f;
import Gi.e;
import L3.s;
import U3.g;
import U3.i;
import U3.l;
import U3.q;
import U3.u;
import android.database.Cursor;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import io.sentry.L0;
import io.sentry.S;
import java.util.ArrayList;
import java.util.Iterator;
import kf.t;
import x3.C6270B;
import x3.y;

/* loaded from: classes2.dex */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public static final String f22099a;

    static {
        String f6 = s.f("DiagnosticsWrkr");
        AbstractC3557B.b0("tagWithPrefix(\"DiagnosticsWrkr\")", f6);
        f22099a = f6;
    }

    public static final String a(l lVar, u uVar, i iVar, ArrayList arrayList) {
        Integer num;
        S s10;
        String str;
        StringBuilder sb2 = new StringBuilder("\n Id \t Class Name\t Job Id\t State\t Unique Name\t Tags\t");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            q qVar = (q) it.next();
            g B10 = iVar.B(e.y(qVar));
            if (B10 != null) {
                num = Integer.valueOf(B10.f17410c);
            } else {
                num = null;
            }
            lVar.getClass();
            S d10 = L0.d();
            if (d10 != null) {
                s10 = d10.v("db.sql.room", "androidx.work.impl.model.WorkNameDao");
            } else {
                s10 = null;
            }
            C6270B a5 = C6270B.a(1, "SELECT name FROM workname WHERE work_spec_id=?");
            String str2 = qVar.f17450a;
            if (str2 == null) {
                a5.s0(1);
            } else {
                a5.b(1, str2);
            }
            ((y) lVar.f17423Z).b();
            Cursor t12 = A7.b.t1((y) lVar.f17423Z, a5, false);
            try {
                ArrayList arrayList2 = new ArrayList(t12.getCount());
                while (t12.moveToNext()) {
                    if (t12.isNull(0)) {
                        str = null;
                    } else {
                        str = t12.getString(0);
                    }
                    arrayList2.add(str);
                }
                t12.close();
                if (s10 != null) {
                    s10.b();
                }
                a5.j();
                String m22 = t.m2(arrayList2, Separators.COMMA, null, null, null, 62);
                String m23 = t.m2(uVar.B(str2), Separators.COMMA, null, null, null, 62);
                StringBuilder s11 = android.gov.nist.core.a.s(Separators.RETURN, str2, "\t ");
                s11.append(qVar.f17452c);
                s11.append("\t ");
                s11.append(num);
                s11.append("\t ");
                s11.append(f.G(qVar.f17451b));
                s11.append("\t ");
                s11.append(m22);
                s11.append("\t ");
                s11.append(m23);
                s11.append('\t');
                sb2.append(s11.toString());
            } catch (Throwable th2) {
                t12.close();
                if (s10 != null) {
                    s10.b();
                }
                a5.j();
                throw th2;
            }
        }
        String sb3 = sb2.toString();
        AbstractC3557B.b0("StringBuilder().apply(builderAction).toString()", sb3);
        return sb3;
    }
}
