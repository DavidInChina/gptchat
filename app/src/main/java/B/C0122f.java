package B;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: B.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0122f extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public AbstractC0137k f1308Y;

    /* renamed from: Z  reason: collision with root package name */
    public Ng.F f1309Z;

    /* renamed from: h0  reason: collision with root package name */
    public /* synthetic */ Object f1310h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ AbstractC0137k f1311i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f1312j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0122f(AbstractC0137k abstractC0137k, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f1311i0 = abstractC0137k;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f1310h0 = obj;
        this.f1312j0 |= Integer.MIN_VALUE;
        return AbstractC0137k.B0(this.f1311i0, this, null);
    }
}
