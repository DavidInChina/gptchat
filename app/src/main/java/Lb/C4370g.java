package lb;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: lb.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4370g extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public K f37998Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f37999Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ K f38000h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f38001i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4370g(K k10, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f38000h0 = k10;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f37999Z = obj;
        this.f38001i0 |= Integer.MIN_VALUE;
        return this.f38000h0.q(null, this);
    }
}
