package oc;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: oc.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4989d extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public k f41249Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f41250Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ k f41251h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f41252i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4989d(k kVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f41251h0 = kVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f41250Z = obj;
        this.f41252i0 |= Integer.MIN_VALUE;
        return k.m(this.f41251h0, null, this);
    }
}
