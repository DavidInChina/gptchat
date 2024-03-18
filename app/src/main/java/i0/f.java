package i0;

import java.util.LinkedHashMap;
import java.util.Map;
import kf.AbstractC4268D;

/* loaded from: classes.dex */
public final class f extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Z  reason: collision with root package name */
    public static final f f32409Z = new f(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final f f32410h0 = new f(1);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f32411Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(int i10) {
        super(2);
        this.f32411Y = i10;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f32411Y) {
            case 0:
                d dVar = (d) obj;
                j jVar = (j) obj2;
                LinkedHashMap m12 = AbstractC4268D.m1(jVar.f32421a);
                for (i iVar : jVar.f32422b.values()) {
                    if (iVar.f32417b) {
                        Map b10 = iVar.f32418c.b();
                        boolean isEmpty = b10.isEmpty();
                        Object obj3 = iVar.f32416a;
                        if (isEmpty) {
                            m12.remove(obj3);
                        } else {
                            m12.put(obj3, b10);
                        }
                    }
                }
                if (m12.isEmpty()) {
                    return null;
                }
                return m12;
            default:
                d dVar2 = (d) obj;
                return obj2;
        }
    }
}
