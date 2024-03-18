package yh;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.security.AccessController;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: yh.o  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC6628o extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final EnumC6628o f51057Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final EnumC6628o f51058Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final EnumC6628o f51059h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final EnumC6628o f51060i0;

    /* renamed from: j0  reason: collision with root package name */
    public static final EnumC6628o f51061j0;

    /* renamed from: k0  reason: collision with root package name */
    public static final EnumC6628o f51062k0;

    /* renamed from: l0  reason: collision with root package name */
    public static final /* synthetic */ EnumC6628o[] f51063l0;

    /* renamed from: m0  reason: collision with root package name */
    public static final boolean f51064m0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Enum, yh.o] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Enum, yh.o] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Enum, yh.o] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, yh.o] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Enum, yh.o] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Enum, yh.o] */
    static {
        Object obj;
        try {
            Class.forName("java.security.AccessController", false, null);
            f51064m0 = Boolean.parseBoolean(System.getProperty("net.bytebuddy.securitymanager", "true"));
        } catch (ClassNotFoundException unused) {
            f51064m0 = false;
        } catch (SecurityException unused2) {
            f51064m0 = true;
        }
        ?? r62 = new Enum("NON_GENERIC", 0);
        f51057Y = r62;
        ?? r72 = new Enum("GENERIC_ARRAY", 1);
        f51058Z = r72;
        ?? r82 = new Enum("PARAMETERIZED", 2);
        f51059h0 = r82;
        ?? r92 = new Enum("WILDCARD", 3);
        f51060i0 = r92;
        ?? r10 = new Enum("VARIABLE", 4);
        f51061j0 = r10;
        ?? r11 = new Enum("VARIABLE_SYMBOLIC", 5);
        f51062k0 = r11;
        f51063l0 = new EnumC6628o[]{r62, r72, r82, r92, r10, r11};
        Th.y a5 = Th.y.a(AbstractC6626n.class);
        if (f51064m0) {
            obj = AccessController.doPrivileged(a5);
        } else {
            obj = a5.run();
        }
        AbstractC2469q0.p(obj);
    }

    public static AbstractC6643w a(Type type, Y y10) {
        if (type instanceof Class) {
            return new C6633q0((Class) type, y10);
        }
        if (type instanceof GenericArrayType) {
            return new C6625m0((GenericArrayType) type, y10);
        }
        if (type instanceof ParameterizedType) {
            return new C6644w0((ParameterizedType) type, y10);
        }
        if (type instanceof TypeVariable) {
            return new E0((TypeVariable) type, y10);
        }
        if (type instanceof WildcardType) {
            return new K0((WildcardType) type, y10);
        }
        throw new IllegalArgumentException("Unknown type: " + type);
    }

    public static EnumC6628o valueOf(String str) {
        return (EnumC6628o) Enum.valueOf(EnumC6628o.class, str);
    }

    public static EnumC6628o[] values() {
        return (EnumC6628o[]) f51063l0.clone();
    }

    public final boolean b() {
        if (this == f51057Y) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        if (this != f51061j0 && this != f51062k0) {
            return false;
        }
        return true;
    }
}
