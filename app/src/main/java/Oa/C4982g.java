package oa;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: oa.g  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4982g extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public Object f41102Y;

    /* renamed from: Z  reason: collision with root package name */
    public String f41103Z;

    /* renamed from: h0  reason: collision with root package name */
    public da.e f41104h0;

    /* renamed from: i0  reason: collision with root package name */
    public /* synthetic */ Object f41105i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ C4972C f41106j0;

    /* renamed from: k0  reason: collision with root package name */
    public int f41107k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4982g(C4972C c4972c, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f41106j0 = c4972c;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f41105i0 = obj;
        this.f41107k0 |= Integer.MIN_VALUE;
        return this.f41106j0.d(null, null, this);
    }
}
