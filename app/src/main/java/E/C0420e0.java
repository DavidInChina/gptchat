package E;

import B.C0176x0;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import id.AbstractC3557B;
import java.util.LinkedHashMap;
import l8.AbstractC4344b;

/* renamed from: E.e0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0420e0 extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f3860Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ float f3861Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0420e0(int i10, float f6) {
        super(1);
        this.f3860Y = i10;
        this.f3861Z = f6;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        int i10 = this.f3860Y;
        float f6 = this.f3861Z;
        switch (i10) {
            case 0:
                AbstractC2469q0.p(obj);
                switch (i10) {
                    case 0:
                        throw null;
                    default:
                        throw null;
                }
            case 5:
                Z0.b bVar = (Z0.b) obj;
                return new Z0.i(kotlin.jvm.internal.m.c(AbstractC4344b.Y0(f6), 0));
            default:
                C0176x0 c0176x0 = (C0176x0) obj;
                AbstractC3557B.c0("$this$DraggableAnchors", c0176x0);
                Boolean bool = Boolean.FALSE;
                Float valueOf = Float.valueOf(0.0f);
                LinkedHashMap linkedHashMap = c0176x0.f1552a;
                linkedHashMap.put(bool, valueOf);
                linkedHashMap.put(Boolean.TRUE, Float.valueOf(f6));
                return jf.y.f36177a;
        }
    }
}
