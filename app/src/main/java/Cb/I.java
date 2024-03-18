package Cb;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes.dex */
public final class I extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public Object f2878Y;

    /* renamed from: Z  reason: collision with root package name */
    public F f2879Z;

    /* renamed from: h0  reason: collision with root package name */
    public /* synthetic */ Object f2880h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ S f2881i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f2882j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(S s10, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f2881i0 = s10;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f2880h0 = obj;
        this.f2882j0 |= Integer.MIN_VALUE;
        return this.f2881i0.a(this);
    }
}
