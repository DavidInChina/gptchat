package e4;

import Gf.r0;
import Gf.v0;
import Lc.l;
import bh.C2220j;
import bh.C2224n;
import dh.C2675A;
import id.AbstractC3557B;
import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.List;
import java.util.regex.Matcher;
import jf.AbstractC3957g;
import kf.q;
import kotlin.jvm.internal.o;
import kotlinx.serialization.descriptors.SerialDescriptor;
import wf.AbstractC6216a;

/* renamed from: e4.g  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2799g extends o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f28962Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ int f28963Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Object f28964h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ Object f28965i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2799g(int i10, int i11, Serializable serializable, Object obj) {
        super(0);
        this.f28962Y = i11;
        this.f28964h0 = serializable;
        this.f28965i0 = obj;
        this.f28963Z = i10;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        Class<?> cls;
        Type type = null;
        int i10 = this.f28962Y;
        Object obj = this.f28965i0;
        Object obj2 = this.f28964h0;
        int i11 = this.f28963Z;
        switch (i10) {
            case 0:
                C2801i c2801i = (C2801i) obj;
                return new C2795c((String) obj2, c2801i.j(), i11, c2801i.f28967Z);
            case 1:
                r0 r0Var = (r0) obj2;
                v0 v0Var = r0Var.f6461Z;
                if (v0Var != null) {
                    type = (Type) v0Var.mo122invoke();
                }
                if (type instanceof Class) {
                    Class cls2 = (Class) type;
                    if (cls2.isArray()) {
                        cls = cls2.getComponentType();
                    } else {
                        cls = Object.class;
                    }
                    AbstractC3557B.Z(cls);
                    return cls;
                } else if (type instanceof GenericArrayType) {
                    if (i11 == 0) {
                        Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
                        AbstractC3557B.Z(genericComponentType);
                        return genericComponentType;
                    }
                    throw new l("Array type has been queried for a non-0th argument: " + r0Var, 3);
                } else if (type instanceof ParameterizedType) {
                    Type type2 = (Type) ((List) ((AbstractC3957g) obj).getValue()).get(i11);
                    if (type2 instanceof WildcardType) {
                        WildcardType wildcardType = (WildcardType) type2;
                        Type[] lowerBounds = wildcardType.getLowerBounds();
                        AbstractC3557B.b0("getLowerBounds(...)", lowerBounds);
                        Type type3 = (Type) q.j3(lowerBounds);
                        if (type3 == null) {
                            Type[] upperBounds = wildcardType.getUpperBounds();
                            AbstractC3557B.b0("getUpperBounds(...)", upperBounds);
                            type2 = (Type) q.i3(upperBounds);
                        } else {
                            type2 = type3;
                        }
                    }
                    AbstractC3557B.Z(type2);
                    return type2;
                } else {
                    throw new l("Non-generic type has been queried for arguments: " + r0Var, 3);
                }
            case 2:
                Lg.i iVar = (Lg.i) obj2;
                CharSequence charSequence = (CharSequence) obj;
                iVar.getClass();
                AbstractC3557B.c0("input", charSequence);
                Matcher matcher = iVar.f11153Y.matcher(charSequence);
                AbstractC3557B.b0("matcher(...)", matcher);
                if (!matcher.find(i11)) {
                    return null;
                }
                return new Lg.g(matcher, charSequence);
            default:
                SerialDescriptor[] serialDescriptorArr = new SerialDescriptor[i11];
                for (int i12 = 0; i12 < i11; i12++) {
                    serialDescriptorArr[i12] = Ad.l.O(((String) obj2) + '.' + ((C2675A) obj).f37653e[i12], C2224n.f26018d, new SerialDescriptor[0], C2220j.f26012Y);
                }
                return serialDescriptorArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2799g(int i10, String str, C2675A c2675a) {
        super(0);
        this.f28962Y = 3;
        this.f28963Z = i10;
        this.f28964h0 = str;
        this.f28965i0 = c2675a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2799g(r0 r0Var, int i10, AbstractC3957g abstractC3957g) {
        super(0);
        this.f28962Y = 1;
        this.f28964h0 = r0Var;
        this.f28963Z = i10;
        this.f28965i0 = abstractC3957g;
    }
}
