package M1;

import java.io.Serializable;
import java.util.Iterator;
import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes2.dex */
public final class z extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public J f11478Y;

    /* renamed from: Z  reason: collision with root package name */
    public Object f11479Z;

    /* renamed from: h0  reason: collision with root package name */
    public Serializable f11480h0;

    /* renamed from: i0  reason: collision with root package name */
    public Object f11481i0;

    /* renamed from: j0  reason: collision with root package name */
    public B f11482j0;

    /* renamed from: k0  reason: collision with root package name */
    public Iterator f11483k0;

    /* renamed from: l0  reason: collision with root package name */
    public /* synthetic */ Object f11484l0;

    /* renamed from: m0  reason: collision with root package name */
    public final /* synthetic */ J f11485m0;

    /* renamed from: n0  reason: collision with root package name */
    public int f11486n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(J j6, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f11485m0 = j6;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f11484l0 = obj;
        this.f11486n0 |= Integer.MIN_VALUE;
        return this.f11485m0.e(this);
    }
}
