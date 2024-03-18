package y;

import Kd.C0830f;
import androidx.lifecycle.AbstractC2084t;
import androidx.lifecycle.AbstractC2086v;
import java.util.Map;
import s3.C5562l;

/* renamed from: y.l  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6474l implements Z.M {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f50231a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f50232b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f50233c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f50234d;

    public /* synthetic */ C6474l(Object obj, Object obj2, Object obj3, int i10) {
        this.f50231a = i10;
        this.f50233c = obj;
        this.f50232b = obj2;
        this.f50234d = obj3;
    }

    @Override // Z.M
    public final void dispose() {
        int i10 = this.f50231a;
        Object obj = this.f50234d;
        Object obj2 = this.f50232b;
        Object obj3 = this.f50233c;
        switch (i10) {
            case 0:
                ((j0.u) obj3).remove(obj2);
                ((C6460A) obj).f50082e.remove(obj2);
                return;
            case 1:
                i0.i iVar = (i0.i) obj3;
                i0.j jVar = (i0.j) obj;
                Map map = jVar.f32421a;
                if (iVar.f32417b) {
                    Map b10 = iVar.f32418c.b();
                    boolean isEmpty = b10.isEmpty();
                    Object obj4 = iVar.f32416a;
                    if (isEmpty) {
                        map.remove(obj4);
                    } else {
                        map.put(obj4, b10);
                    }
                }
                jVar.f32422b.remove(obj2);
                return;
            case 2:
                C5562l c5562l = (C5562l) obj;
                ((t3.m) obj2).b().b(c5562l);
                ((j0.u) obj3).remove(c5562l);
                return;
            default:
                ((C0830f) obj3).f9734b.v();
                ((AbstractC2086v) obj2).h().g((AbstractC2084t) obj);
                return;
        }
    }

    public C6474l(t3.m mVar, C5562l c5562l, j0.u uVar) {
        this.f50231a = 2;
        this.f50232b = mVar;
        this.f50234d = c5562l;
        this.f50233c = uVar;
    }

    public C6474l(i0.i iVar, i0.j jVar, Object obj) {
        this.f50231a = 1;
        this.f50233c = iVar;
        this.f50234d = jVar;
        this.f50232b = obj;
    }
}
