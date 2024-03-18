package th;

import java.lang.annotation.Annotation;
import k6.AbstractC4194d;
import yh.C6641v;

/* renamed from: th.r  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5810r extends a0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f46230a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f46231b;

    public C5810r(int i10, Object obj) {
        this.f46230a = i10;
        this.f46231b = obj;
    }

    @Override // th.a0
    public final int a() {
        return 3;
    }

    @Override // th.a0
    public final boolean b(Object obj) {
        int i10 = this.f46230a;
        Object obj2 = this.f46231b;
        switch (i10) {
            case 0:
                return ((Annotation) obj2).equals(obj);
            case 1:
                return ((Enum) obj2).equals(obj);
            default:
                return ((Class) obj2).equals(obj);
        }
    }

    @Override // th.a0
    public final Object c() {
        int i10 = this.f46230a;
        Object obj = this.f46231b;
        switch (i10) {
            case 0:
                return (Annotation) obj;
            case 1:
                return (Enum) obj;
            default:
                return (Class) obj;
        }
    }

    public final boolean equals(Object obj) {
        int i10 = this.f46230a;
        Object obj2 = this.f46231b;
        switch (i10) {
            case 0:
                if (this != obj) {
                    if (!(obj instanceof a0)) {
                        return false;
                    }
                    a0 a0Var = (a0) obj;
                    if (!AbstractC4194d.b(a0Var.a()) || !((Annotation) obj2).equals(a0Var.c())) {
                        return false;
                    }
                }
                return true;
            case 1:
                if (this != obj) {
                    if (!(obj instanceof a0)) {
                        return false;
                    }
                    a0 a0Var2 = (a0) obj;
                    if (!AbstractC4194d.b(a0Var2.a()) || !((Enum) obj2).equals(a0Var2.c())) {
                        return false;
                    }
                }
                return true;
            default:
                if (this != obj) {
                    if (!(obj instanceof a0)) {
                        return false;
                    }
                    a0 a0Var3 = (a0) obj;
                    if (!AbstractC4194d.b(a0Var3.a()) || !((Class) obj2).equals(a0Var3.c())) {
                        return false;
                    }
                }
                return true;
        }
    }

    public final int hashCode() {
        int i10 = this.f46230a;
        Object obj = this.f46231b;
        switch (i10) {
            case 0:
                return ((Annotation) obj).hashCode();
            case 1:
                return ((Enum) obj).hashCode();
            default:
                return ((Class) obj).hashCode();
        }
    }

    public final String toString() {
        int i10 = this.f46230a;
        Object obj = this.f46231b;
        switch (i10) {
            case 0:
                return ((Annotation) obj).toString();
            case 1:
                return ((Enum) obj).toString();
            default:
                return g0.JAVA_19_CAPABLE_VM.i(C6641v.l1((Class) obj));
        }
    }
}
