package lb;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: lb.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4372i extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public String f38009Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f38010Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ K f38011h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f38012i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4372i(K k10, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f38011h0 = k10;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f38010Z = obj;
        this.f38012i0 |= Integer.MIN_VALUE;
        return this.f38011h0.s(null, this);
    }
}
