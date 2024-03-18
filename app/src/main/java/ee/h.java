package Ee;

import io.ktor.utils.io.z;
import java.nio.charset.Charset;
import kotlinx.serialization.KSerializer;
import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes2.dex */
public final class h extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public Object f4720Y;

    /* renamed from: Z  reason: collision with root package name */
    public Object f4721Z;

    /* renamed from: h0  reason: collision with root package name */
    public KSerializer f4722h0;

    /* renamed from: i0  reason: collision with root package name */
    public Charset f4723i0;

    /* renamed from: j0  reason: collision with root package name */
    public z f4724j0;

    /* renamed from: k0  reason: collision with root package name */
    public a f4725k0;

    /* renamed from: l0  reason: collision with root package name */
    public /* synthetic */ Object f4726l0;

    /* renamed from: m0  reason: collision with root package name */
    public final /* synthetic */ i f4727m0;

    /* renamed from: n0  reason: collision with root package name */
    public int f4728n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f4727m0 = iVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f4726l0 = obj;
        this.f4728n0 |= Integer.MIN_VALUE;
        return i.a(this.f4727m0, null, null, null, null, this);
    }
}
