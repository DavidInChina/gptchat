package S0;

import java.util.List;
import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: S0.e  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1344e extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public C1348i f16006Y;

    /* renamed from: Z  reason: collision with root package name */
    public List f16007Z;

    /* renamed from: h0  reason: collision with root package name */
    public AbstractC1356q f16008h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f16009i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f16010j0;

    /* renamed from: k0  reason: collision with root package name */
    public /* synthetic */ Object f16011k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ C1348i f16012l0;

    /* renamed from: m0  reason: collision with root package name */
    public int f16013m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1344e(C1348i c1348i, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f16012l0 = c1348i;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f16011k0 = obj;
        this.f16013m0 |= Integer.MIN_VALUE;
        return this.f16012l0.b(this);
    }
}
