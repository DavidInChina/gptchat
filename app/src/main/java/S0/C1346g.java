package S0;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: S0.g  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1346g extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public AbstractC1356q f16017Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f16018Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C1348i f16019h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f16020i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1346g(C1348i c1348i, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f16019h0 = c1348i;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f16018Z = obj;
        this.f16020i0 |= Integer.MIN_VALUE;
        return this.f16019h0.d(null, this);
    }
}
