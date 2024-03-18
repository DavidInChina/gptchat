package a6;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import java.nio.charset.Charset;
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

/* renamed from: a6.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1931a implements AbstractC5577b {

    /* renamed from: c  reason: collision with root package name */
    public static final byte[] f23897c;

    /* renamed from: d  reason: collision with root package name */
    public static final byte[] f23898d;

    /* renamed from: e  reason: collision with root package name */
    public static final byte[] f23899e;

    /* renamed from: a  reason: collision with root package name */
    public final String f23900a;

    /* renamed from: b  reason: collision with root package name */
    public final AbstractC5091c f23901b;

    static {
        Charset charset = Lg.a.f11131a;
        byte[] bytes = Separators.COMMA.getBytes(charset);
        AbstractC3557B.b0("this as java.lang.String).getBytes(charset)", bytes);
        f23897c = bytes;
        byte[] bytes2 = "[".getBytes(charset);
        AbstractC3557B.b0("this as java.lang.String).getBytes(charset)", bytes2);
        f23898d = bytes2;
        byte[] bytes3 = "]".getBytes(charset);
        AbstractC3557B.b0("this as java.lang.String).getBytes(charset)", bytes3);
        f23899e = bytes3;
    }

    public C1931a(String str, AbstractC5091c abstractC5091c) {
        AbstractC3557B.c0("internalLogger", abstractC5091c);
        this.f23900a = str;
        this.f23901b = abstractC5091c;
    }

    @Override // s5.AbstractC5577b
    public final C5576a a(C5271a c5271a, List list) {
        AbstractC3557B.c0("context", c5271a);
        AbstractC3557B.c0("batchData", list);
        String uuid = UUID.randomUUID().toString();
        AbstractC3557B.b0("randomUUID().toString()", uuid);
        Locale locale = Locale.US;
        Object[] objArr = new Object[3];
        String str = this.f23900a;
        if (str == null) {
            str = c5271a.f43895a.f40609Z;
        }
        objArr[0] = str;
        objArr[1] = "ddsource";
        String str2 = c5271a.f43901g;
        objArr[2] = str2;
        String format = String.format(locale, "%s/api/v2/logs?%s=%s", Arrays.copyOf(objArr, 3));
        Map a12 = AbstractC4268D.a1(new C3959i("DD-API-KEY", c5271a.f43896b), new C3959i("DD-EVP-ORIGIN", str2), new C3959i("DD-EVP-ORIGIN-VERSION", c5271a.f43902h), new C3959i("DD-REQUEST-ID", uuid));
        ArrayList arrayList = new ArrayList(AbstractC6583a.H1(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((d) it.next()).f45751a);
        }
        return new C5576a(uuid, "Logs Request", format, a12, P4.a.i0(arrayList, f23897c, f23898d, f23899e, this.f23901b), "application/json");
    }
}
