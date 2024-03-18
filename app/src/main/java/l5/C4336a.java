package l5;

import I8.n;
import Wh.B;
import Wh.D;
import Wh.E;
import Wh.F;
import Wh.p;
import Wh.r;
import Wh.s;
import Wh.u;
import Wh.v;
import Wh.y;
import id.AbstractC3557B;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import jh.H1;
import jh.L1;
import kf.AbstractC4268D;
import kf.w;

/* renamed from: l5.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4336a implements f {

    /* renamed from: d  reason: collision with root package name */
    public static final u f37830d = L1.j("application/json; charset=utf-8");

    /* renamed from: a  reason: collision with root package name */
    public final Map f37831a = w.f37484Y;

    /* renamed from: b  reason: collision with root package name */
    public final n f37832b = com.auth0.android.request.internal.f.f26731a;

    /* renamed from: c  reason: collision with root package name */
    public final Wh.w f37833c;

    static {
        Pattern pattern = u.f21259c;
    }

    public C4336a() {
        v vVar = new v();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        AbstractC3557B.c0("unit", timeUnit);
        vVar.f21289x = Xh.b.b("timeout", 10, timeUnit);
        vVar.f21290y = Xh.b.b("timeout", 10, timeUnit);
        this.f37833c = new Wh.w(vVar);
    }

    public final g a(String str, U3.u uVar) {
        AbstractC3557B.c0("url", str);
        AbstractC3557B.c0("options", uVar);
        char[] cArr = s.f21249j;
        s n10 = H1.n(str);
        y yVar = new y();
        r f6 = n10.f();
        int i10 = 0;
        if (((d) uVar.f17492Z) instanceof c) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : ((Map) uVar.f17493h0).entrySet()) {
                if (entry.getValue() instanceof String) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            ArrayList arrayList = new ArrayList(linkedHashMap.size());
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                String str2 = (String) entry2.getKey();
                Object value = entry2.getValue();
                AbstractC3557B.a0("null cannot be cast to non-null type kotlin.String", value);
                String str3 = (String) value;
                AbstractC3557B.c0("name", str2);
                if (f6.f21247g == null) {
                    f6.f21247g = new ArrayList();
                }
                ArrayList arrayList2 = f6.f21247g;
                AbstractC3557B.Z(arrayList2);
                char[] cArr2 = s.f21249j;
                arrayList2.add(H1.h(str2, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, 219));
                ArrayList arrayList3 = f6.f21247g;
                AbstractC3557B.Z(arrayList3);
                arrayList3.add(H1.h(str3, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, 219));
                arrayList.add(f6);
            }
            yVar.e(((d) uVar.f17492Z).toString(), null);
        } else {
            int i11 = B.f21116a;
            String i12 = this.f37832b.i((Map) uVar.f17493h0);
            AbstractC3557B.b0("gson.toJson(options.parameters)", i12);
            Charset charset = Lg.a.f11131a;
            u uVar2 = f37830d;
            if (uVar2 != null) {
                Pattern pattern = u.f21259c;
                Charset a5 = uVar2.a(null);
                if (a5 == null) {
                    uVar2 = L1.p(uVar2 + "; charset=utf-8");
                } else {
                    charset = a5;
                }
            }
            byte[] bytes = i12.getBytes(charset);
            AbstractC3557B.b0("this as java.lang.String).getBytes(charset)", bytes);
            yVar.e(((d) uVar.f17492Z).toString(), H1.k(0, bytes.length, uVar2, bytes));
        }
        LinkedHashMap e12 = AbstractC4268D.e1(this.f37831a, (Map) uVar.f17494i0);
        String[] strArr = new String[e12.size() * 2];
        for (Map.Entry entry3 : e12.entrySet()) {
            String obj = Lg.n.U2((String) entry3.getKey()).toString();
            String obj2 = Lg.n.U2((String) entry3.getValue()).toString();
            H1.i(obj);
            H1.j(obj2, obj);
            strArr[i10] = obj;
            strArr[i10 + 1] = obj2;
            i10 += 2;
        }
        yVar.f21331a = f6.b();
        p pVar = new p();
        kf.s.O1(pVar.f21239a, strArr);
        yVar.f21333c = pVar;
        D f10 = this.f37833c.b(yVar.b()).f();
        F f11 = f10.f21136l0;
        AbstractC3557B.Z(f11);
        return new g(f10.f21133i0, ((E) f11).f21146h0.Q0(), f10.f21135k0.M());
    }
}
