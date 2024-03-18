package hd;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: hd.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3407a extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public C3409c f32240Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f32241Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C3409c f32242h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f32243i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3407a(C3409c c3409c, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f32242h0 = c3409c;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f32241Z = obj;
        this.f32243i0 |= Integer.MIN_VALUE;
        return this.f32242h0.b(this);
    }
}
