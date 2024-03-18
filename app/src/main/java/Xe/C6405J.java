package xe;

import N.C1017a;
import id.AbstractC3557B;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import yf.AbstractC6583a;

/* renamed from: xe.J  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6405J {

    /* renamed from: k  reason: collision with root package name */
    public static final C6410O f49838k = com.google.android.gms.internal.play_billing.N.b("http://localhost");

    /* renamed from: a  reason: collision with root package name */
    public C6408M f49839a;

    /* renamed from: b  reason: collision with root package name */
    public String f49840b = "";

    /* renamed from: c  reason: collision with root package name */
    public int f49841c = 0;

    /* renamed from: d  reason: collision with root package name */
    public boolean f49842d = false;

    /* renamed from: e  reason: collision with root package name */
    public String f49843e = null;

    /* renamed from: f  reason: collision with root package name */
    public String f49844f = null;

    /* renamed from: g  reason: collision with root package name */
    public String f49845g;

    /* renamed from: h  reason: collision with root package name */
    public List f49846h;

    /* renamed from: i  reason: collision with root package name */
    public AbstractC6402G f49847i;

    /* renamed from: j  reason: collision with root package name */
    public C6411P f49848j;

    public C6405J() {
        C6408M c6408m = C6408M.f49850c;
        kf.v vVar = kf.v.f37483Y;
        AbstractC6401F.f49837b.getClass();
        C6426o c6426o = C6426o.f49944c;
        AbstractC3557B.c0("protocol", c6408m);
        this.f49839a = c6408m;
        Set set = AbstractC6412a.f49873a;
        Charset charset = Lg.a.f11131a;
        AbstractC3557B.c0("charset", charset);
        StringBuilder sb2 = new StringBuilder();
        CharsetEncoder newEncoder = charset.newEncoder();
        AbstractC3557B.b0("charset.newEncoder()", newEncoder);
        AbstractC6412a.h(AbstractC3557B.z0(newEncoder, "", 0, "".length()), new C1017a(false, sb2, false));
        String sb3 = sb2.toString();
        AbstractC3557B.b0("StringBuilder().apply(builderAction).toString()", sb3);
        this.f49845g = sb3;
        this.f49846h = new ArrayList(AbstractC6583a.H1(vVar, 10));
        C6403H s10 = Ad.l.s();
        AbstractC3557B.J(s10, c6426o);
        this.f49847i = s10;
        this.f49848j = new C6411P(s10);
    }

    public final void a() {
        if (this.f49840b.length() > 0 || AbstractC3557B.K(this.f49839a.f49854a, "file")) {
            return;
        }
        C6410O c6410o = f49838k;
        this.f49840b = c6410o.f49859b;
        C6408M c6408m = this.f49839a;
        C6408M c6408m2 = C6408M.f49850c;
        if (AbstractC3557B.K(c6408m, C6408M.f49850c)) {
            this.f49839a = c6410o.f49858a;
        }
        if (this.f49841c == 0) {
            this.f49841c = c6410o.f49860c;
        }
    }

    public final C6410O b() {
        String str;
        String str2;
        a();
        C6408M c6408m = this.f49839a;
        String str3 = this.f49840b;
        int i10 = this.f49841c;
        List<String> list = this.f49846h;
        ArrayList arrayList = new ArrayList(AbstractC6583a.H1(list, 10));
        for (String str4 : list) {
            arrayList.add(AbstractC6412a.d(str4));
        }
        AbstractC6401F x02 = AbstractC3557B.x0(this.f49848j.f49871a);
        String e10 = AbstractC6412a.e(this.f49845g, 0, 0, false, 15);
        String str5 = this.f49843e;
        if (str5 != null) {
            str = AbstractC6412a.d(str5);
        } else {
            str = null;
        }
        String str6 = this.f49844f;
        if (str6 != null) {
            str2 = AbstractC6412a.d(str6);
        } else {
            str2 = null;
        }
        boolean z10 = this.f49842d;
        a();
        StringBuilder sb2 = new StringBuilder(256);
        P4.a.i(this, sb2);
        String sb3 = sb2.toString();
        AbstractC3557B.b0("appendTo(StringBuilder(256)).toString()", sb3);
        return new C6410O(c6408m, str3, i10, arrayList, x02, e10, str, str2, z10, sb3);
    }

    public final void c(List list) {
        AbstractC3557B.c0("<set-?>", list);
        this.f49846h = list;
    }

    public final void d(String str) {
        AbstractC3557B.c0("<set-?>", str);
        this.f49840b = str;
    }

    public final void e(C6408M c6408m) {
        AbstractC3557B.c0("<set-?>", c6408m);
        this.f49839a = c6408m;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(256);
        P4.a.i(this, sb2);
        String sb3 = sb2.toString();
        AbstractC3557B.b0("appendTo(StringBuilder(256)).toString()", sb3);
        return sb3;
    }
}
