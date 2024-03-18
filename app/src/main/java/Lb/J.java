package lb;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes2.dex */
public final class J extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public K f37950Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f37951Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ K f37952h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f37953i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(K k10, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f37952h0 = k10;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f37951Z = obj;
        this.f37953i0 |= Integer.MIN_VALUE;
        return this.f37952h0.w(null, this);
    }
}
