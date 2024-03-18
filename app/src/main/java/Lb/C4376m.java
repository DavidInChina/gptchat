package lb;

import ca.AbstractC2313e;
import java.util.Iterator;
import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: lb.m  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4376m extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public K f38032Y;

    /* renamed from: Z  reason: collision with root package name */
    public AbstractC2313e f38033Z;

    /* renamed from: h0  reason: collision with root package name */
    public Iterator f38034h0;

    /* renamed from: i0  reason: collision with root package name */
    public /* synthetic */ Object f38035i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ K f38036j0;

    /* renamed from: k0  reason: collision with root package name */
    public int f38037k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4376m(K k10, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f38036j0 = k10;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f38035i0 = obj;
        this.f38037k0 |= Integer.MIN_VALUE;
        return K.n(this.f38036j0, null, this);
    }
}
