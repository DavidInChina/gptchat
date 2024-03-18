package ec;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: ec.G  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2837G extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public C2847Q f29144Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f29145Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C2847Q f29146h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f29147i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2837G(C2847Q c2847q, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f29146h0 = c2847q;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f29145Z = obj;
        this.f29147i0 |= Integer.MIN_VALUE;
        return C2847Q.o(this.f29146h0, this);
    }
}
