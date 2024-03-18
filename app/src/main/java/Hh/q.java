package hh;

import id.AbstractC3557B;
import java.lang.reflect.Field;
import java.util.Map;
import wf.AbstractC6216a;

/* loaded from: classes2.dex */
public final class q extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f32375Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ t f32376Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(t tVar, int i10) {
        super(0);
        this.f32375Y = i10;
        this.f32376Z = tVar;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        int i10 = this.f32375Y;
        t tVar = this.f32376Z;
        switch (i10) {
            case 0:
                Object invoke = ((Class) tVar.f32382b.getValue()).getDeclaredMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
                if (invoke != null) {
                    return invoke;
                }
                AbstractC3557B.A2();
                throw null;
            default:
                Field declaredField = ((Class) tVar.f32382b.getValue()).getDeclaredField("mServices");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(tVar.f32383c.getValue());
                if (obj != null) {
                    return (Map) obj;
                }
                throw new ClassCastException("null cannot be cast to non-null type kotlin.collections.Map<android.os.IBinder, android.app.Service>");
        }
    }
}
