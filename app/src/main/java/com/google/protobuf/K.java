package com.google.protobuf;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class K {
    public static int a(Map.Entry entry) {
        return ((C2488a0) entry.getKey()).f27515Z;
    }

    public static S b(Object obj) {
        return ((GeneratedMessageLite$ExtendableMessage) obj).extensions;
    }

    public static void c(Object obj) {
        ((GeneratedMessageLite$ExtendableMessage) obj).extensions.m();
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x0203, code lost:
        if (r8 != 10) goto L86;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object d(Object obj, T0.m mVar, C2491b0 c2491b0, J j6, S s10, Object obj2, w1 w1Var) {
        Object obj3;
        Object obj4;
        List list;
        C2488a0 c2488a0 = c2491b0.f27522d;
        int i10 = c2488a0.f27515Z;
        N1 n12 = c2488a0.f27516h0;
        if (c2488a0.f27517i0 && c2488a0.f27518j0) {
            switch (n12.ordinal()) {
                case 0:
                    list = new ArrayList();
                    mVar.F(list);
                    break;
                case 1:
                    list = new ArrayList();
                    mVar.A(list);
                    break;
                case 2:
                    list = new ArrayList();
                    mVar.m(list);
                    break;
                case 3:
                    list = new ArrayList();
                    mVar.k(list);
                    break;
                case 4:
                    list = new ArrayList();
                    mVar.o(list);
                    break;
                case 5:
                    list = new ArrayList();
                    mVar.K(list);
                    break;
                case 6:
                    list = new ArrayList();
                    mVar.r(list);
                    break;
                case 7:
                    list = new ArrayList();
                    mVar.u(list);
                    break;
                case 8:
                case 9:
                case 10:
                case 11:
                default:
                    throw new IllegalStateException("Type cannot be packed: " + c2488a0.f27516h0);
                case 12:
                    list = new ArrayList();
                    mVar.g(list);
                    break;
                case 13:
                    ArrayList arrayList = new ArrayList();
                    mVar.p(arrayList);
                    obj2 = AbstractC2507g1.z(obj, i10, arrayList, c2488a0.f27514Y, obj2, w1Var);
                    list = arrayList;
                    break;
                case 14:
                    list = new ArrayList();
                    mVar.e(list);
                    break;
                case 15:
                    list = new ArrayList();
                    mVar.n(list);
                    break;
                case 16:
                    list = new ArrayList();
                    mVar.b(list);
                    break;
                case 17:
                    list = new ArrayList();
                    mVar.f(list);
                    break;
            }
            s10.p(c2488a0, list);
        } else {
            if (n12 == N1.ENUM) {
                int B10 = mVar.B();
                if (c2488a0.f27514Y.a(B10) == null) {
                    return AbstractC2507g1.E(obj, i10, B10, obj2, w1Var);
                }
                obj3 = Integer.valueOf(B10);
            } else {
                int ordinal = n12.ordinal();
                M0 m02 = c2491b0.f27521c;
                switch (ordinal) {
                    case 0:
                        obj3 = Double.valueOf(mVar.readDouble());
                        break;
                    case 1:
                        obj3 = Float.valueOf(mVar.readFloat());
                        break;
                    case 2:
                        obj3 = Long.valueOf(mVar.I());
                        break;
                    case 3:
                        obj3 = Long.valueOf(mVar.c());
                        break;
                    case 4:
                        obj3 = Integer.valueOf(mVar.B());
                        break;
                    case 5:
                        obj3 = Long.valueOf(mVar.d());
                        break;
                    case 6:
                        obj3 = Integer.valueOf(mVar.h());
                        break;
                    case 7:
                        obj3 = Boolean.valueOf(mVar.i());
                        break;
                    case 8:
                        obj3 = mVar.v();
                        break;
                    case 9:
                        if (!c2488a0.f27517i0) {
                            Object obj5 = s10.f27492a.get(c2488a0);
                            if (obj5 instanceof AbstractC2497d0) {
                                AbstractC2504f1 b10 = C2495c1.f27531c.b(obj5);
                                if (!((AbstractC2497d0) obj5).isMutable()) {
                                    Object g10 = b10.g();
                                    b10.c(g10, obj5);
                                    s10.p(c2488a0, g10);
                                    obj5 = g10;
                                }
                                mVar.O(obj5, b10, j6);
                                return obj2;
                            }
                        }
                        Class<?> cls = m02.getClass();
                        mVar.e0(3);
                        AbstractC2504f1 a5 = C2495c1.f27531c.a(cls);
                        Object g11 = a5.g();
                        mVar.Q(g11, a5, j6);
                        a5.d(g11);
                        obj3 = g11;
                        break;
                    case 10:
                        if (!c2488a0.f27517i0) {
                            Object obj6 = s10.f27492a.get(c2488a0);
                            if (obj6 instanceof AbstractC2497d0) {
                                AbstractC2504f1 b11 = C2495c1.f27531c.b(obj6);
                                if (!((AbstractC2497d0) obj6).isMutable()) {
                                    Object g12 = b11.g();
                                    b11.c(g12, obj6);
                                    s10.p(c2488a0, g12);
                                    obj6 = g12;
                                }
                                mVar.e0(2);
                                mVar.S(obj6, b11, j6);
                                return obj2;
                            }
                        }
                        obj3 = mVar.Z(m02.getClass(), j6);
                        break;
                    case 11:
                        obj3 = mVar.V();
                        break;
                    case 12:
                        obj3 = Integer.valueOf(mVar.l());
                        break;
                    case 13:
                        throw new IllegalStateException("Shouldn't reach here.");
                    case 14:
                        obj3 = Integer.valueOf(mVar.D());
                        break;
                    case 15:
                        obj3 = Long.valueOf(mVar.j());
                        break;
                    case 16:
                        obj3 = Integer.valueOf(mVar.s());
                        break;
                    case 17:
                        obj3 = Long.valueOf(mVar.t());
                        break;
                    default:
                        obj3 = null;
                        break;
                }
            }
            if (c2488a0.f27517i0) {
                s10.a(c2488a0, obj3);
            } else {
                int ordinal2 = c2488a0.f27516h0.ordinal();
                if (ordinal2 != 9) {
                    obj4 = obj3;
                }
                Object obj7 = s10.f27492a.get(c2488a0);
                obj4 = obj3;
                if (obj7 != null) {
                    M0 m03 = (M0) obj3;
                    AbstractC2490b abstractC2490b = (AbstractC2490b) ((M0) obj7).toBuilder();
                    abstractC2490b.getClass();
                    X x10 = (X) abstractC2490b;
                    if (x10.f27506Y.getClass().isInstance(m03)) {
                        x10.f((AbstractC2497d0) ((AbstractC2493c) m03));
                        obj4 = x10.c();
                    } else {
                        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
                    }
                }
                s10.p(c2488a0, obj4);
            }
        }
        return obj2;
    }

    public static void e(S4.o oVar, Map.Entry entry) {
        C2488a0 c2488a0 = (C2488a0) entry.getKey();
        boolean z10 = c2488a0.f27517i0;
        N1 n12 = c2488a0.f27516h0;
        int i10 = c2488a0.f27515Z;
        if (z10) {
            int ordinal = n12.ordinal();
            boolean z11 = c2488a0.f27518j0;
            switch (ordinal) {
                case 0:
                    AbstractC2507g1.H(i10, (List) entry.getValue(), oVar, z11);
                    return;
                case 1:
                    AbstractC2507g1.L(i10, (List) entry.getValue(), oVar, z11);
                    return;
                case 2:
                    AbstractC2507g1.O(i10, (List) entry.getValue(), oVar, z11);
                    return;
                case 3:
                    AbstractC2507g1.W(i10, (List) entry.getValue(), oVar, z11);
                    return;
                case 4:
                    AbstractC2507g1.N(i10, (List) entry.getValue(), oVar, z11);
                    return;
                case 5:
                    AbstractC2507g1.K(i10, (List) entry.getValue(), oVar, z11);
                    return;
                case 6:
                    AbstractC2507g1.J(i10, (List) entry.getValue(), oVar, z11);
                    return;
                case 7:
                    AbstractC2507g1.F(i10, (List) entry.getValue(), oVar, z11);
                    return;
                case 8:
                    AbstractC2507g1.U(i10, (List) entry.getValue(), oVar);
                    return;
                case 9:
                    List list = (List) entry.getValue();
                    if (list != null && !list.isEmpty()) {
                        AbstractC2507g1.M(i10, (List) entry.getValue(), oVar, C2495c1.f27531c.a(list.get(0).getClass()));
                        return;
                    }
                    return;
                case 10:
                    List list2 = (List) entry.getValue();
                    if (list2 != null && !list2.isEmpty()) {
                        AbstractC2507g1.P(i10, (List) entry.getValue(), oVar, C2495c1.f27531c.a(list2.get(0).getClass()));
                        return;
                    }
                    return;
                case 11:
                    AbstractC2507g1.G(i10, (List) entry.getValue(), oVar);
                    return;
                case 12:
                    AbstractC2507g1.V(i10, (List) entry.getValue(), oVar, z11);
                    return;
                case 13:
                    AbstractC2507g1.N(i10, (List) entry.getValue(), oVar, z11);
                    return;
                case 14:
                    AbstractC2507g1.Q(i10, (List) entry.getValue(), oVar, z11);
                    return;
                case 15:
                    AbstractC2507g1.R(i10, (List) entry.getValue(), oVar, z11);
                    return;
                case 16:
                    AbstractC2507g1.S(i10, (List) entry.getValue(), oVar, z11);
                    return;
                case 17:
                    AbstractC2507g1.T(i10, (List) entry.getValue(), oVar, z11);
                    return;
                default:
                    return;
            }
        }
        switch (n12.ordinal()) {
            case 0:
                oVar.s(i10, ((Double) entry.getValue()).doubleValue());
                return;
            case 1:
                oVar.w(i10, ((Float) entry.getValue()).floatValue());
                return;
            case 2:
                oVar.z(i10, ((Long) entry.getValue()).longValue());
                return;
            case 3:
                oVar.G(i10, ((Long) entry.getValue()).longValue());
                return;
            case 4:
                oVar.y(i10, ((Integer) entry.getValue()).intValue());
                return;
            case 5:
                oVar.v(i10, ((Long) entry.getValue()).longValue());
                return;
            case 6:
                oVar.u(i10, ((Integer) entry.getValue()).intValue());
                return;
            case 7:
                oVar.q(i10, ((Boolean) entry.getValue()).booleanValue());
                return;
            case 8:
                ((AbstractC2549y) oVar.f16184Z).K0(i10, (String) entry.getValue());
                return;
            case 9:
                oVar.x(i10, C2495c1.f27531c.a(entry.getValue().getClass()), entry.getValue());
                return;
            case 10:
                oVar.A(i10, C2495c1.f27531c.a(entry.getValue().getClass()), entry.getValue());
                return;
            case 11:
                oVar.r(i10, (AbstractC2534q) entry.getValue());
                return;
            case 12:
                oVar.F(i10, ((Integer) entry.getValue()).intValue());
                return;
            case 13:
                oVar.y(i10, ((Integer) entry.getValue()).intValue());
                return;
            case 14:
                oVar.B(i10, ((Integer) entry.getValue()).intValue());
                return;
            case 15:
                oVar.C(i10, ((Long) entry.getValue()).longValue());
                return;
            case 16:
                oVar.D(i10, ((Integer) entry.getValue()).intValue());
                return;
            case 17:
                oVar.E(i10, ((Long) entry.getValue()).longValue());
                return;
            default:
                return;
        }
    }
}
