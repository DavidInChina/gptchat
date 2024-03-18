package bb;

import Z.AbstractC1725n;
import Z.AbstractC1734s;
import cb.C2334C;
import cb.C2353W;
import l0.AbstractC4326r;

/* renamed from: bb.c0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2158c0 extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ C2353W f25792Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C2334C f25793Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ wf.k f25794h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ AbstractC4326r f25795i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ float f25796j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ String f25797k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ boolean f25798l0;

    /* renamed from: m0  reason: collision with root package name */
    public final /* synthetic */ boolean f25799m0;

    /* renamed from: n0  reason: collision with root package name */
    public final /* synthetic */ int f25800n0;

    /* renamed from: o0  reason: collision with root package name */
    public final /* synthetic */ int f25801o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2158c0(C2353W c2353w, C2334C c2334c, wf.k kVar, AbstractC4326r abstractC4326r, float f6, String str, boolean z10, boolean z11, int i10, int i11) {
        super(2);
        this.f25792Y = c2353w;
        this.f25793Z = c2334c;
        this.f25794h0 = kVar;
        this.f25795i0 = abstractC4326r;
        this.f25796j0 = f6;
        this.f25797k0 = str;
        this.f25798l0 = z10;
        this.f25799m0 = z11;
        this.f25800n0 = i10;
        this.f25801o0 = i11;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int p10 = AbstractC1734s.p(this.f25800n0 | 1);
        boolean z10 = this.f25799m0;
        L4.a.i(this.f25792Y, this.f25793Z, this.f25794h0, this.f25795i0, this.f25796j0, this.f25797k0, this.f25798l0, z10, (AbstractC1725n) obj, p10, this.f25801o0);
        return jf.y.f36177a;
    }
}
