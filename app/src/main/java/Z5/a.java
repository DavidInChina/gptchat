package Z5;

import id.AbstractC3557B;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import jf.y;
import kotlin.jvm.internal.o;
import q5.C5271a;
import t5.AbstractC5676b;
import wf.n;

/* loaded from: classes2.dex */
public final class a extends o implements n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ c f23204Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ int f23205Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ String f23206h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ Throwable f23207i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ Map f23208j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ Set f23209k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ String f23210l0;

    /* renamed from: m0  reason: collision with root package name */
    public final /* synthetic */ long f23211m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, int i10, String str, Throwable th2, LinkedHashMap linkedHashMap, HashSet hashSet, String str2, long j6) {
        super(2);
        this.f23204Y = cVar;
        this.f23205Z = i10;
        this.f23206h0 = str;
        this.f23207i0 = th2;
        this.f23208j0 = linkedHashMap;
        this.f23209k0 = hashSet;
        this.f23210l0 = str2;
        this.f23211m0 = j6;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        C5271a c5271a = (C5271a) obj;
        AbstractC5676b abstractC5676b = (AbstractC5676b) obj2;
        AbstractC3557B.c0("datadogContext", c5271a);
        AbstractC3557B.c0("eventBatchWriter", abstractC5676b);
        String str = this.f23210l0;
        AbstractC3557B.b0("threadName", str);
        c cVar = this.f23204Y;
        cVar.f23218i0.e(abstractC5676b, P4.a.M(cVar.f23216Z, this.f23205Z, this.f23206h0, this.f23207i0, this.f23208j0, this.f23209k0, this.f23211m0, str, c5271a, cVar.f23219j0, cVar.f23215Y, cVar.f23220k0, cVar.f23221l0, null, null, 28672));
        return y.f36177a;
    }
}
