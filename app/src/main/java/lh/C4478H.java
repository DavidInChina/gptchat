package lh;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: lh.H  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4478H extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public Object f38444Y;

    /* renamed from: Z  reason: collision with root package name */
    public Object f38445Z;

    /* renamed from: h0  reason: collision with root package name */
    public /* synthetic */ Object f38446h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ C4479I f38447i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f38448j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4478H(C4479I c4479i, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f38447i0 = c4479i;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f38446h0 = obj;
        this.f38448j0 |= Integer.MIN_VALUE;
        return this.f38447i0.a(null, this);
    }
}
