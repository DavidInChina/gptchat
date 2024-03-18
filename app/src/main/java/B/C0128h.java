package B;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: B.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0128h extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public AbstractC0137k f1333Y;

    /* renamed from: Z  reason: collision with root package name */
    public Ng.F f1334Z;

    /* renamed from: h0  reason: collision with root package name */
    public C0120e0 f1335h0;

    /* renamed from: i0  reason: collision with root package name */
    public /* synthetic */ Object f1336i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ AbstractC0137k f1337j0;

    /* renamed from: k0  reason: collision with root package name */
    public int f1338k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0128h(AbstractC0137k abstractC0137k, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f1337j0 = abstractC0137k;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f1336i0 = obj;
        this.f1338k0 |= Integer.MIN_VALUE;
        return AbstractC0137k.D0(this.f1337j0, null, null, this);
    }
}
