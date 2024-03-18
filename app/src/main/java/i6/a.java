package I6;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import jf.C3959i;
import kf.AbstractC4268D;
import p5.AbstractC5091c;
import q5.C5271a;
import s5.AbstractC5577b;
import s5.C5576a;
import t5.d;
import yf.AbstractC6583a;

/* loaded from: classes2.dex */
public final class a implements AbstractC5577b {

    /* renamed from: c  reason: collision with root package name */
    public static final byte[] f8091c;

    /* renamed from: a  reason: collision with root package name */
    public final String f8092a;

    /* renamed from: b  reason: collision with root package name */
    public final AbstractC5091c f8093b;

    static {
        byte[] bytes = Separators.RETURN.getBytes(Lg.a.f11131a);
        AbstractC3557B.b0("this as java.lang.String).getBytes(charset)", bytes);
        f8091c = bytes;
    }

    public a(String str, AbstractC5091c abstractC5091c) {
        AbstractC3557B.c0("internalLogger", abstractC5091c);
        this.f8092a = str;
        this.f8093b = abstractC5091c;
    }

    @Override // s5.AbstractC5577b
    public final C5576a a(C5271a c5271a, List list) {
        byte[] i02;
        AbstractC3557B.c0("context", c5271a);
        AbstractC3557B.c0("batchData", list);
        String uuid = UUID.randomUUID().toString();
        AbstractC3557B.b0("randomUUID().toString()", uuid);
        Locale locale = Locale.US;
        Object[] objArr = new Object[1];
        String str = this.f8092a;
        if (str == null) {
            str = c5271a.f43895a.f40609Z;
        }
        objArr[0] = str;
        String format = String.format(locale, "%s/api/v2/spans", Arrays.copyOf(objArr, 1));
        Map a12 = AbstractC4268D.a1(new C3959i("DD-API-KEY", c5271a.f43896b), new C3959i("DD-EVP-ORIGIN", c5271a.f43901g), new C3959i("DD-EVP-ORIGIN-VERSION", c5271a.f43902h), new C3959i("DD-REQUEST-ID", uuid));
        ArrayList arrayList = new ArrayList(AbstractC6583a.H1(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((d) it.next()).f45751a);
        }
        i02 = P4.a.i0(arrayList, f8091c, new byte[0], new byte[0], this.f8093b);
        return new C5576a(uuid, "Traces Request", format, a12, i02, "text/plain;charset=UTF-8");
    }
}
