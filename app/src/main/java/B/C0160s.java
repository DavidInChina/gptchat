package B;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: B.s  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0160s extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public C0163t f1482Y;

    /* renamed from: Z  reason: collision with root package name */
    public Object f1483Z;

    /* renamed from: h0  reason: collision with root package name */
    public /* synthetic */ Object f1484h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ C0163t f1485i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f1486j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0160s(C0163t c0163t, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f1485i0 = c0163t;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f1484h0 = obj;
        this.f1486j0 |= Integer.MIN_VALUE;
        return this.f1485i0.c(null, this);
    }
}
