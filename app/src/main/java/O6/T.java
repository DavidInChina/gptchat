package o6;

import id.AbstractC3557B;
import java.util.Map;

/* loaded from: classes2.dex */
public final class T extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f40724Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ a0 f40725Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ T(a0 a0Var, int i10) {
        super(1);
        this.f40724Y = i10;
        this.f40725Z = a0Var;
    }

    @Override // wf.k
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f40724Y) {
            case 0:
                invoke((Map) obj);
                return yVar;
            default:
                invoke((Map) obj);
                return yVar;
        }
    }

    public final void invoke(Map map) {
        int i10 = this.f40724Y;
        a0 a0Var = this.f40725Z;
        switch (i10) {
            case 0:
                AbstractC3557B.c0("it", map);
                map.putAll(a0Var.c().b());
                map.put("view_timestamp_offset", Long.valueOf(a0Var.f40795p));
                return;
            default:
                AbstractC3557B.c0("it", map);
                map.remove(a0Var.f40792m);
                return;
        }
    }
}
