package S8;

import N0.C1046e;
import Z.AbstractC1725n;
import Z.AbstractC1734s;
import java.util.Map;
import l0.AbstractC4326r;

/* loaded from: classes.dex */
public final class G extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ M f16216Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C1046e f16217Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ AbstractC4326r f16218h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ boolean f16219i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ int f16220j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ int f16221k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ wf.k f16222l0;

    /* renamed from: m0  reason: collision with root package name */
    public final /* synthetic */ Map f16223m0;

    /* renamed from: n0  reason: collision with root package name */
    public final /* synthetic */ wf.k f16224n0;

    /* renamed from: o0  reason: collision with root package name */
    public final /* synthetic */ wf.k f16225o0;

    /* renamed from: p0  reason: collision with root package name */
    public final /* synthetic */ int f16226p0;

    /* renamed from: q0  reason: collision with root package name */
    public final /* synthetic */ int f16227q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(M m10, C1046e c1046e, AbstractC4326r abstractC4326r, boolean z10, int i10, int i11, wf.k kVar, Map map, wf.k kVar2, wf.k kVar3, int i12, int i13) {
        super(2);
        this.f16216Y = m10;
        this.f16217Z = c1046e;
        this.f16218h0 = abstractC4326r;
        this.f16219i0 = z10;
        this.f16220j0 = i10;
        this.f16221k0 = i11;
        this.f16222l0 = kVar;
        this.f16223m0 = map;
        this.f16224n0 = kVar2;
        this.f16225o0 = kVar3;
        this.f16226p0 = i12;
        this.f16227q0 = i13;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int p10 = AbstractC1734s.p(this.f16226p0 | 1);
        wf.k kVar = this.f16224n0;
        wf.k kVar2 = this.f16225o0;
        L.a(this.f16216Y, this.f16217Z, this.f16218h0, this.f16219i0, this.f16220j0, this.f16221k0, this.f16222l0, this.f16223m0, kVar, kVar2, (AbstractC1725n) obj, p10, this.f16227q0);
        return jf.y.f36177a;
    }
}
