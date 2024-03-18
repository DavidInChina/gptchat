package Ee;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes2.dex */
public final class e extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f4703Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f4704Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ f f4705h0;

    /* renamed from: i0  reason: collision with root package name */
    public f f4706i0;

    /* renamed from: j0  reason: collision with root package name */
    public Object f4707j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f4705h0 = fVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f4703Y = obj;
        this.f4704Z |= Integer.MIN_VALUE;
        return this.f4705h0.c(null, this);
    }
}
