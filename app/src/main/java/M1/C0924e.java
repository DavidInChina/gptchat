package M1;

import java.io.Serializable;
import java.util.Iterator;
import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: M1.e  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0924e extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public Serializable f11432Y;

    /* renamed from: Z  reason: collision with root package name */
    public Iterator f11433Z;

    /* renamed from: h0  reason: collision with root package name */
    public /* synthetic */ Object f11434h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ R4.a f11435i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f11436j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0924e(R4.a aVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f11435i0 = aVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f11434h0 = obj;
        this.f11436j0 |= Integer.MIN_VALUE;
        return R4.a.T(this.f11435i0, null, null, this);
    }
}
