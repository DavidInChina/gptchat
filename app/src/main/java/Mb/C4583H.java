package mb;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: mb.H  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4583H extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f39030Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f39031Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ M1.v f39032h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4583H(M1.v vVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f39032h0 = vVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f39030Y = obj;
        this.f39031Z |= Integer.MIN_VALUE;
        return this.f39032h0.c(null, this);
    }
}
