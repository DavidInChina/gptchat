package E4;

import android.gov.nist.core.Separators;
import java.util.List;
import java.util.Locale;
import s3.z;
import v4.C5971a;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final List f4470a;

    /* renamed from: b  reason: collision with root package name */
    public final C5971a f4471b;

    /* renamed from: c  reason: collision with root package name */
    public final String f4472c;

    /* renamed from: d  reason: collision with root package name */
    public final long f4473d;

    /* renamed from: e  reason: collision with root package name */
    public final int f4474e;

    /* renamed from: f  reason: collision with root package name */
    public final long f4475f;

    /* renamed from: g  reason: collision with root package name */
    public final String f4476g;

    /* renamed from: h  reason: collision with root package name */
    public final List f4477h;

    /* renamed from: i  reason: collision with root package name */
    public final C4.e f4478i;

    /* renamed from: j  reason: collision with root package name */
    public final int f4479j;

    /* renamed from: k  reason: collision with root package name */
    public final int f4480k;

    /* renamed from: l  reason: collision with root package name */
    public final int f4481l;

    /* renamed from: m  reason: collision with root package name */
    public final float f4482m;

    /* renamed from: n  reason: collision with root package name */
    public final float f4483n;

    /* renamed from: o  reason: collision with root package name */
    public final float f4484o;

    /* renamed from: p  reason: collision with root package name */
    public final float f4485p;

    /* renamed from: q  reason: collision with root package name */
    public final C4.a f4486q;

    /* renamed from: r  reason: collision with root package name */
    public final U3.i f4487r;

    /* renamed from: s  reason: collision with root package name */
    public final C4.b f4488s;

    /* renamed from: t  reason: collision with root package name */
    public final List f4489t;

    /* renamed from: u  reason: collision with root package name */
    public final int f4490u;

    /* renamed from: v  reason: collision with root package name */
    public final boolean f4491v;

    /* renamed from: w  reason: collision with root package name */
    public final J0.a f4492w;

    /* renamed from: x  reason: collision with root package name */
    public final z f4493x;

    /* renamed from: y  reason: collision with root package name */
    public final int f4494y;

    public e(List list, C5971a c5971a, String str, long j6, int i10, long j10, String str2, List list2, C4.e eVar, int i11, int i12, int i13, float f6, float f10, float f11, float f12, C4.a aVar, U3.i iVar, List list3, int i14, C4.b bVar, boolean z10, J0.a aVar2, z zVar, int i15) {
        this.f4470a = list;
        this.f4471b = c5971a;
        this.f4472c = str;
        this.f4473d = j6;
        this.f4474e = i10;
        this.f4475f = j10;
        this.f4476g = str2;
        this.f4477h = list2;
        this.f4478i = eVar;
        this.f4479j = i11;
        this.f4480k = i12;
        this.f4481l = i13;
        this.f4482m = f6;
        this.f4483n = f10;
        this.f4484o = f11;
        this.f4485p = f12;
        this.f4486q = aVar;
        this.f4487r = iVar;
        this.f4489t = list3;
        this.f4490u = i14;
        this.f4488s = bVar;
        this.f4491v = z10;
        this.f4492w = aVar2;
        this.f4493x = zVar;
        this.f4494y = i15;
    }

    public final String a(String str) {
        int i10;
        StringBuilder p10 = android.gov.nist.core.a.p(str);
        p10.append(this.f4472c);
        p10.append(Separators.RETURN);
        C5971a c5971a = this.f4471b;
        e eVar = (e) c5971a.f47156i.d(this.f4475f);
        if (eVar != null) {
            p10.append("\t\tParents: ");
            p10.append(eVar.f4472c);
            for (e eVar2 = (e) c5971a.f47156i.d(eVar.f4475f); eVar2 != null; eVar2 = (e) c5971a.f47156i.d(eVar2.f4475f)) {
                p10.append("->");
                p10.append(eVar2.f4472c);
            }
            p10.append(str);
            p10.append(Separators.RETURN);
        }
        List list = this.f4477h;
        if (!list.isEmpty()) {
            p10.append(str);
            p10.append("\tMasks: ");
            p10.append(list.size());
            p10.append(Separators.RETURN);
        }
        int i11 = this.f4479j;
        if (i11 != 0 && (i10 = this.f4480k) != 0) {
            p10.append(str);
            p10.append("\tBackground: ");
            p10.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(i11), Integer.valueOf(i10), Integer.valueOf(this.f4481l)));
        }
        List list2 = this.f4470a;
        if (!list2.isEmpty()) {
            p10.append(str);
            p10.append("\tShapes:\n");
            for (Object obj : list2) {
                p10.append(str);
                p10.append("\t\t");
                p10.append(obj);
                p10.append(Separators.RETURN);
            }
        }
        return p10.toString();
    }

    public final String toString() {
        return a("");
    }
}
