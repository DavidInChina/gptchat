package Sh;

import java.io.Serializable;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Member;
import java.lang.reflect.Type;
import yh.AbstractC6632q;
import yh.C6633q0;
import yh.C6641v;
import yh.EnumC6628o;
import yh.X;
import yh.l1;
import yh.m1;
import yh.r1;
import yh.t1;
import yh.z1;

/* JADX WARN: Init of enum EF1 can be incorrect */
/* JADX WARN: Init of enum EF12 can be incorrect */
/* JADX WARN: Init of enum EF13 can be incorrect */
/* JADX WARN: Init of enum EF14 can be incorrect */
/* JADX WARN: Init of enum EF15 can be incorrect */
/* JADX WARN: Init of enum EF5 can be incorrect */
/* JADX WARN: Init of enum EF7 can be incorrect */
/* JADX WARN: Init of enum EF8 can be incorrect */
/* JADX WARN: Init of enum i0 can be incorrect */
/* JADX WARN: Init of enum j0 can be incorrect */
/* loaded from: classes2.dex */
public enum G {
    /* JADX INFO: Fake field, exist only in values array */
    CONSTABLE("java.lang.constant.Constable", 1537, (AbstractC6632q) null, new AbstractC6632q[0]),
    /* JADX INFO: Fake field, exist only in values array */
    TYPE_DESCRIPTOR("java.lang.invoke.TypeDescriptor", 1537, (AbstractC6632q) null, new AbstractC6632q[0]),
    /* JADX INFO: Fake field, exist only in values array */
    TYPE_DESCRIPTOR_OF_FIELD("java.lang.invoke.TypeDescriptor$OfField", 1537, (AbstractC6632q) null, r6),
    /* JADX INFO: Fake field, exist only in values array */
    TYPE_DESCRIPTOR_OF_METHOD("java.lang.invoke.TypeDescriptor$OfMethod", 1537, (AbstractC6632q) null, r6),
    /* JADX INFO: Fake field, exist only in values array */
    CONSTANT_DESCRIPTION("java.lang.constant.ConstantDesc", 1537, (AbstractC6632q) null, new AbstractC6632q[0]),
    /* JADX INFO: Fake field, exist only in values array */
    DYNAMIC_CONSTANT_DESCRIPTION("java.lang.constant.DynamicConstantDesc", 1025, r17, r10),
    /* JADX INFO: Fake field, exist only in values array */
    CLASS_DESCRIPTION("java.lang.constant.ClassDesc", 1537, (AbstractC6632q) null, r10, r5.f16697Y),
    /* JADX INFO: Fake field, exist only in values array */
    METHOD_TYPE_DESCRIPTION("java.lang.constant.MethodTypeDesc", 1537, (AbstractC6632q) null, r10, r14),
    /* JADX INFO: Fake field, exist only in values array */
    METHOD_HANDLE_DESCRIPTION("java.lang.constant.MethodHandleDesc", 1537, (AbstractC6632q) null, r10),
    /* JADX INFO: Fake field, exist only in values array */
    MODULE("java.lang.constant.DirectMethodHandleDesc", 1537, (AbstractC6632q) null, r15.f16697Y),
    METHOD_HANDLE("java.lang.invoke.MethodHandle", 1025, r35, r10),
    /* JADX INFO: Fake field, exist only in values array */
    MODULE("java.lang.invoke.MethodHandles", 1, Object.class, new Type[0]),
    METHOD_TYPE("java.lang.invoke.MethodType", 17, C6641v.l1(Object.class), r10, r14, C6641v.l1(Serializable.class)),
    /* JADX INFO: Fake field, exist only in values array */
    METHOD_HANDLES_LOOKUP("java.lang.invoke.MethodHandles$Lookup", 25, Object.class, new Type[0]),
    /* JADX INFO: Fake field, exist only in values array */
    MODULE("java.lang.invoke.CallSite", 1025, Object.class, new Type[0]),
    /* JADX INFO: Fake field, exist only in values array */
    VAR_HANDLE("java.lang.invoke.VarHandle", 1025, C6633q0.i1(Object.class), r10),
    /* JADX INFO: Fake field, exist only in values array */
    MODULE("java.lang.reflect.Parameter", 17, Object.class, AnnotatedElement.class),
    /* JADX INFO: Fake field, exist only in values array */
    EXECUTABLE("java.lang.reflect.Executable", 1025, AccessibleObject.class, Member.class, GenericDeclaration.class),
    /* JADX INFO: Fake field, exist only in values array */
    MODULE("java.lang.Module", 17, Object.class, AnnotatedElement.class),
    /* JADX INFO: Fake field, exist only in values array */
    CONSTANT_BOOTSTRAPS("java.lang.invoke.ConstantBootstraps", 17, Object.class, new Type[0]),
    RECORD("java.lang.Record", 1025, Object.class, new Type[0]),
    /* JADX INFO: Fake field, exist only in values array */
    OBJECT_METHODS("java.lang.runtime.ObjectMethods", 1, Object.class, new Type[0]),
    /* JADX INFO: Fake field, exist only in values array */
    ACCESS_CONTROL_CONTEXT("java.security.AccessControlContext", 17, (AbstractC6632q) null, new AbstractC6632q[0]);
    

    /* renamed from: Y  reason: collision with root package name */
    public final F f16697Y;

    /* renamed from: Z  reason: collision with root package name */
    public transient /* synthetic */ Class f16698Z;

    /* renamed from: h0  reason: collision with root package name */
    public transient /* synthetic */ Boolean f16699h0;

    static {
        G g10;
        G g11;
        G g12;
        G g13;
        l1 l1Var = l1.f51039b0;
        F f6 = g11.f16697Y;
        C6641v.l1(Object.class);
        F f10 = g13.f16697Y;
        F f11 = g12.f16697Y;
        C6641v.l1(Object.class);
        F f12 = g10.f16697Y;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    G(String str, int i10, AbstractC6632q abstractC6632q, AbstractC6632q... abstractC6632qArr) {
        this(str, i10, r12, new t1(abstractC6632qArr));
        l1.a w02;
        if (abstractC6632q == null) {
            l1.a aVar = l1.a.f51045N;
            w02 = null;
        } else {
            w02 = abstractC6632q.w0();
        }
    }

    public final boolean a() {
        Boolean bool;
        Class<?> cls;
        jf.y yVar = jf.y.f36177a;
        Boolean bool2 = this.f16699h0;
        F f6 = this.f16697Y;
        Class<?> cls2 = null;
        if (bool2 != null) {
            bool = null;
        } else {
            try {
                if (this.f16698Z != null) {
                    cls = null;
                } else {
                    cls = Class.forName(f6.f51050i0, false, null);
                }
                if (cls != null) {
                    this.f16698Z = cls;
                }
                bool = Boolean.TRUE;
            } catch (ClassNotFoundException unused) {
                bool = Boolean.FALSE;
            }
        }
        if (bool == null) {
            bool = this.f16699h0;
        } else {
            this.f16699h0 = bool;
        }
        if (!bool.booleanValue()) {
            return false;
        }
        try {
            if (this.f16698Z == null) {
                cls2 = Class.forName(f6.f51050i0, false, null);
            }
            if (cls2 == null) {
                cls2 = this.f16698Z;
            } else {
                this.f16698Z = cls2;
            }
            return cls2.isInstance(yVar);
        } catch (ClassNotFoundException unused2) {
            return false;
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [yh.m1, Sh.F] */
    G(String str, int i10, l1.a aVar, r1 r1Var) {
        this.f16697Y = new m1(str, i10, aVar, r1Var);
    }

    G(String str, int i10, Class cls, Type... typeArr) {
        this(str, i10, EnumC6628o.a(cls, X.f50977Y), new z1(typeArr));
    }
}
