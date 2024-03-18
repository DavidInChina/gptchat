package h2;

import java.io.Serializable;
import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: h2.c  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3306c extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public Object f31759Y;

    /* renamed from: Z  reason: collision with root package name */
    public Object f31760Z;

    /* renamed from: h0  reason: collision with root package name */
    public Serializable f31761h0;

    /* renamed from: i0  reason: collision with root package name */
    public Wg.d f31762i0;

    /* renamed from: j0  reason: collision with root package name */
    public /* synthetic */ Object f31763j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ C3309f f31764k0;

    /* renamed from: l0  reason: collision with root package name */
    public int f31765l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3306c(C3309f c3309f, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f31764k0 = c3309f;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f31763j0 = obj;
        this.f31765l0 |= Integer.MIN_VALUE;
        return this.f31764k0.b(null, null, null, this);
    }
}
