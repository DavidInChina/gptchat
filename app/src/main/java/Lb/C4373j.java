package lb;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: lb.j  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4373j extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public K f38013Y;

    /* renamed from: Z  reason: collision with root package name */
    public String f38014Z;

    /* renamed from: h0  reason: collision with root package name */
    public Object f38015h0;

    /* renamed from: i0  reason: collision with root package name */
    public /* synthetic */ Object f38016i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ K f38017j0;

    /* renamed from: k0  reason: collision with root package name */
    public int f38018k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4373j(K k10, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f38017j0 = k10;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f38016i0 = obj;
        this.f38018k0 |= Integer.MIN_VALUE;
        return K.m(this.f38017j0, null, null, this);
    }
}
