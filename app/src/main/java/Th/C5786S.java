package th;

import java.lang.annotation.AnnotationTypeMismatchException;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;

/* renamed from: th.S  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5786S extends Z {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f46190a;

    /* renamed from: b  reason: collision with root package name */
    public final String f46191b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f46192c;

    public C5786S(String str, ClassNotFoundException classNotFoundException) {
        this.f46190a = 2;
        this.f46191b = str;
        this.f46192c = classNotFoundException;
    }

    @Override // th.a0
    public final Object c() {
        int i10 = this.f46190a;
        String str = this.f46191b;
        Object obj = this.f46192c;
        switch (i10) {
            case 0:
                throw new EnumConstantNotPresentException((Class) obj, str);
            case 1:
                throw new AnnotationTypeMismatchException((Method) obj, str);
            default:
                throw new TypeNotPresentException(str, (ClassNotFoundException) obj);
        }
    }

    public final String toString() {
        int i10 = this.f46190a;
        String str = this.f46191b;
        switch (i10) {
            case 0:
                return android.gov.nist.core.a.g(str, " /* Warning: constant not present! */");
            case 1:
                return android.gov.nist.core.a.A("/* Warning type mismatch! \"", str, "\" */");
            default:
                return android.gov.nist.core.a.g(str, ".class /* Warning: type not present! */");
        }
    }

    public C5786S(GenericDeclaration genericDeclaration, String str, int i10) {
        this.f46190a = i10;
        this.f46192c = genericDeclaration;
        this.f46191b = str;
    }
}
