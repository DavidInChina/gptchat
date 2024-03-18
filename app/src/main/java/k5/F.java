package k5;

import Vc.C1485a;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.gov.nist.javax.sip.header.extensions.ReferencesHeader;
import android.gov.nist.javax.sip.stack.SIPServerTransaction;
import android.graphics.Bitmap;
import androidx.recyclerview.widget.RecyclerView;
import id.AbstractC3557B;
import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import nf.AbstractC4825e;
import of.EnumC5000a;
import p5.EnumC5090b;
import pc.AbstractC5137p;
import pc.C5117C;
import pc.C5118D;
import pc.C5120F;
import pc.C5131j;
import pc.C5132k;
import pc.C5135n;
import pc.C5136o;
import q5.C5271a;
import x6.AbstractC6287d;
import x6.C6277A;
import x6.C6282b0;
import x6.C6284c;
import x6.C6285c0;
import x6.C6290e;
import x6.C6293f;
import x6.C6294f0;
import x6.C6296g;
import x6.C6297g0;
import x6.C6299h;
import x6.C6302i;
import x6.C6303i0;
import x6.C6305j;
import x6.C6306j0;
import x6.C6308k;
import x6.C6309k0;
import x6.C6311l;
import x6.C6314m;
import x6.C6317n;
import x6.C6320o;
import x6.C6323p;
import x6.C6326q;
import x6.C6331s;
import x6.C6334t;
import x6.C6337u;
import x6.C6340v;
import x6.C6346x;
import x6.C6349y;
import x6.EnumC6279a0;
import x6.EnumC6288d0;
import x6.EnumC6343w;
import x6.EnumC6352z;
import x6.Q;
import x6.S;
import x6.T;
import x6.U;
import x6.V;
import x6.W;
import x6.X;
import x6.Y;
import x6.Z;
import y5.C6543b;
import y5.C6544c;
import z.AbstractC6708l;

/* loaded from: classes2.dex */
public final class F implements o4.m, p4.f {
    public F(RecyclerView recyclerView) {
    }

    public static C6346x A(I8.u uVar) {
        try {
            return new C6346x(uVar.q0("count").I());
        } catch (IllegalStateException e10) {
            throw new RuntimeException("Unable to parse json into type LongTask", e10);
        } catch (NullPointerException e11) {
            throw new RuntimeException("Unable to parse json into type LongTask", e11);
        } catch (NumberFormatException e12) {
            throw new RuntimeException("Unable to parse json into type LongTask", e12);
        }
    }

    public static C6349y B(I8.u uVar) {
        String str;
        try {
            String T = uVar.q0("name").T();
            String T10 = uVar.q0(ParameterNames.VERSION).T();
            I8.r q02 = uVar.q0("build");
            if (q02 != null) {
                str = q02.T();
            } else {
                str = null;
            }
            String T11 = uVar.q0("version_major").T();
            AbstractC3557B.b0("name", T);
            AbstractC3557B.b0(ParameterNames.VERSION, T10);
            AbstractC3557B.b0("versionMajor", T11);
            return new C6349y(T, T10, str, T11);
        } catch (IllegalStateException e10) {
            throw new RuntimeException("Unable to parse json into type Os", e10);
        } catch (NullPointerException e11) {
            throw new RuntimeException("Unable to parse json into type Os", e11);
        } catch (NumberFormatException e12) {
            throw new RuntimeException("Unable to parse json into type Os", e12);
        }
    }

    public static C6277A C(I8.u uVar) {
        try {
            return new C6277A(uVar.q0("x").I(), uVar.q0("y").I());
        } catch (IllegalStateException e10) {
            throw new RuntimeException("Unable to parse json into type Position", e10);
        } catch (NullPointerException e11) {
            throw new RuntimeException("Unable to parse json into type Position", e11);
        } catch (NumberFormatException e12) {
            throw new RuntimeException("Unable to parse json into type Position", e12);
        }
    }

    public static x6.B D(I8.u uVar) {
        try {
            return new x6.B(uVar.q0("count").I());
        } catch (IllegalStateException e10) {
            throw new RuntimeException("Unable to parse json into type Resource", e10);
        } catch (NullPointerException e11) {
            throw new RuntimeException("Unable to parse json into type Resource", e11);
        } catch (NumberFormatException e12) {
            throw new RuntimeException("Unable to parse json into type Resource", e12);
        }
    }

    public static x6.C E(I8.u uVar) {
        Boolean bool;
        try {
            String T = uVar.q0("test_id").T();
            String T10 = uVar.q0("result_id").T();
            I8.r q02 = uVar.q0("injected");
            if (q02 != null) {
                bool = Boolean.valueOf(q02.f());
            } else {
                bool = null;
            }
            AbstractC3557B.b0("testId", T);
            AbstractC3557B.b0("resultId", T10);
            return new x6.C(T, T10, bool);
        } catch (IllegalStateException e10) {
            throw new RuntimeException("Unable to parse json into type Synthetics", e10);
        } catch (NullPointerException e11) {
            throw new RuntimeException("Unable to parse json into type Synthetics", e11);
        } catch (NumberFormatException e12) {
            throw new RuntimeException("Unable to parse json into type Synthetics", e12);
        }
    }

    public static x6.E F(I8.u uVar) {
        String str;
        String str2;
        try {
            I8.r q02 = uVar.q0(ParameterNames.ID);
            String str3 = null;
            if (q02 != null) {
                str = q02.T();
            } else {
                str = null;
            }
            I8.r q03 = uVar.q0("name");
            if (q03 != null) {
                str2 = q03.T();
            } else {
                str2 = null;
            }
            I8.r q04 = uVar.q0("email");
            if (q04 != null) {
                str3 = q04.T();
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it = ((K8.j) uVar.f8133Y.entrySet()).iterator();
            while (((K8.k) it).hasNext()) {
                Map.Entry entry = (Map.Entry) ((K8.i) it).next();
                if (!kf.q.S2(entry.getKey(), x6.E.f48940e)) {
                    Object key = entry.getKey();
                    AbstractC3557B.b0("entry.key", key);
                    linkedHashMap.put(key, entry.getValue());
                }
            }
            return new x6.E(str, str2, str3, linkedHashMap);
        } catch (IllegalStateException e10) {
            throw new RuntimeException("Unable to parse json into type Usr", e10);
        } catch (NullPointerException e11) {
            throw new RuntimeException("Unable to parse json into type Usr", e11);
        } catch (NumberFormatException e12) {
            throw new RuntimeException("Unable to parse json into type Usr", e12);
        }
    }

    public static x6.F G(I8.u uVar) {
        try {
            Number M10 = uVar.q0("width").M();
            Number M11 = uVar.q0("height").M();
            AbstractC3557B.b0("width", M10);
            AbstractC3557B.b0("height", M11);
            return new x6.F(M10, M11);
        } catch (IllegalStateException e10) {
            throw new RuntimeException("Unable to parse json into type Viewport", e10);
        } catch (NullPointerException e11) {
            throw new RuntimeException("Unable to parse json into type Viewport", e11);
        } catch (NumberFormatException e12) {
            throw new RuntimeException("Unable to parse json into type Viewport", e12);
        }
    }

    public static x6.G H(I8.u uVar) {
        String str;
        String str2;
        String str3;
        x6.E e10;
        C6305j c6305j;
        C6334t c6334t;
        x6.C c10;
        C6299h c6299h;
        C6349y c6349y;
        C6331s c6331s;
        C6314m c6314m;
        C6308k c6308k;
        String T;
        AbstractC3557B.c0("jsonObject", uVar);
        try {
            long I10 = uVar.q0("date").I();
            C6293f j6 = j(uVar.q0(SIPServerTransaction.CONTENT_TYPE_APPLICATION).y());
            I8.r q02 = uVar.q0(ReferencesHeader.SERVICE);
            if (q02 != null) {
                str = q02.T();
            } else {
                str = null;
            }
            I8.r q03 = uVar.q0(ParameterNames.VERSION);
            if (q03 != null) {
                str2 = q03.T();
            } else {
                str2 = null;
            }
            I8.r q04 = uVar.q0("build_version");
            if (q04 != null) {
                str3 = q04.T();
            } else {
                str3 = null;
            }
            C6284c h10 = h(uVar.q0(ParameterNames.SESSION).y());
            I8.r q05 = uVar.q0("source");
            int i10 = 0;
            if (q05 != null && (T = q05.T()) != null) {
                int[] h11 = AbstractC6708l.h(7);
                int length = h11.length;
                while (i10 < length) {
                    int i11 = h11[i10];
                    if (AbstractC3557B.K(AbstractC6287d.a(i11), T)) {
                        i10 = i11;
                    } else {
                        i10++;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
            C6290e i12 = i(uVar.q0("view").y());
            I8.r q06 = uVar.q0("usr");
            if (q06 != null) {
                e10 = F(q06.y());
            } else {
                e10 = null;
            }
            I8.r q07 = uVar.q0("connectivity");
            if (q07 != null) {
                c6305j = n(q07.y());
            } else {
                c6305j = null;
            }
            I8.r q08 = uVar.q0("display");
            if (q08 != null) {
                c6334t = x(q08.y());
            } else {
                c6334t = null;
            }
            I8.r q09 = uVar.q0("synthetics");
            if (q09 != null) {
                c10 = E(q09.y());
            } else {
                c10 = null;
            }
            I8.r q010 = uVar.q0("ci_test");
            if (q010 != null) {
                c6299h = l(q010.y());
            } else {
                c6299h = null;
            }
            I8.r q011 = uVar.q0("os");
            if (q011 != null) {
                c6349y = B(q011.y());
            } else {
                c6349y = null;
            }
            I8.r q012 = uVar.q0("device");
            if (q012 != null) {
                c6331s = w(q012.y());
            } else {
                c6331s = null;
            }
            C6320o s10 = s(uVar.q0("_dd").y());
            I8.r q013 = uVar.q0("context");
            if (q013 != null) {
                c6314m = q(q013.y());
            } else {
                c6314m = null;
            }
            I8.r q014 = uVar.q0("container");
            if (q014 != null) {
                c6308k = o(q014.y());
            } else {
                c6308k = null;
            }
            return new x6.G(I10, j6, str, str2, str3, h10, i10, i12, e10, c6305j, c6334t, c10, c6299h, c6349y, c6331s, s10, c6314m, c6308k, P5.c.z(uVar.q0("action").y()));
        } catch (IllegalStateException e11) {
            throw new RuntimeException("Unable to parse json into type ActionEvent", e11);
        } catch (NullPointerException e12) {
            throw new RuntimeException("Unable to parse json into type ActionEvent", e12);
        } catch (NumberFormatException e13) {
            throw new RuntimeException("Unable to parse json into type ActionEvent", e13);
        }
    }

    public static x6.H I(I8.u uVar) {
        try {
            ArrayList arrayList = uVar.q0(ParameterNames.ID).s().f8131Y;
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((I8.r) it.next()).T());
            }
            return new x6.H(arrayList2);
        } catch (IllegalStateException e10) {
            throw new RuntimeException("Unable to parse json into type Action", e10);
        } catch (NullPointerException e11) {
            throw new RuntimeException("Unable to parse json into type Action", e11);
        } catch (NumberFormatException e12) {
            throw new RuntimeException("Unable to parse json into type Action", e12);
        }
    }

    public static x6.I J(I8.u uVar) {
        try {
            String T = uVar.q0(ParameterNames.ID).T();
            AbstractC3557B.b0(ParameterNames.ID, T);
            return new x6.I(T);
        } catch (IllegalStateException e10) {
            throw new RuntimeException("Unable to parse json into type Application", e10);
        } catch (NullPointerException e11) {
            throw new RuntimeException("Unable to parse json into type Application", e11);
        } catch (NumberFormatException e12) {
            throw new RuntimeException("Unable to parse json into type Application", e12);
        }
    }

    public static x6.J K(I8.u uVar) {
        String str;
        String str2;
        String str3;
        try {
            String T = uVar.q0("uuid").T();
            String T10 = uVar.q0("name").T();
            boolean f6 = uVar.q0("is_system").f();
            I8.r q02 = uVar.q0("load_address");
            if (q02 != null) {
                str = q02.T();
            } else {
                str = null;
            }
            I8.r q03 = uVar.q0("max_address");
            if (q03 != null) {
                str2 = q03.T();
            } else {
                str2 = null;
            }
            I8.r q04 = uVar.q0("arch");
            if (q04 != null) {
                str3 = q04.T();
            } else {
                str3 = null;
            }
            AbstractC3557B.b0("uuid", T);
            AbstractC3557B.b0("name", T10);
            return new x6.J(T, T10, str, str2, str3, f6);
        } catch (IllegalStateException e10) {
            throw new RuntimeException("Unable to parse json into type BinaryImage", e10);
        } catch (NullPointerException e11) {
            throw new RuntimeException("Unable to parse json into type BinaryImage", e11);
        } catch (NumberFormatException e12) {
            throw new RuntimeException("Unable to parse json into type BinaryImage", e12);
        }
    }

    public static x6.K L(I8.u uVar) {
        String str;
        int[] h10;
        try {
            String T = uVar.q0("message").T();
            I8.r q02 = uVar.q0("type");
            String str2 = null;
            if (q02 != null) {
                str = q02.T();
            } else {
                str = null;
            }
            I8.r q03 = uVar.q0("stack");
            if (q03 != null) {
                str2 = q03.T();
            }
            String T10 = uVar.q0("source").T();
            AbstractC3557B.b0("jsonObject.get(\"source\").asString", T10);
            for (int i10 : AbstractC6708l.h(8)) {
                if (AbstractC3557B.K(AbstractC6287d.d(i10), T10)) {
                    AbstractC3557B.b0("message", T);
                    return new x6.K(T, str, str2, i10);
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        } catch (IllegalStateException e10) {
            throw new RuntimeException("Unable to parse json into type Cause", e10);
        } catch (NullPointerException e11) {
            throw new RuntimeException("Unable to parse json into type Cause", e11);
        } catch (NumberFormatException e12) {
            throw new RuntimeException("Unable to parse json into type Cause", e12);
        }
    }

    public static x6.L M(I8.u uVar) {
        String str;
        try {
            I8.r q02 = uVar.q0("technology");
            String str2 = null;
            if (q02 != null) {
                str = q02.T();
            } else {
                str = null;
            }
            I8.r q03 = uVar.q0("carrier_name");
            if (q03 != null) {
                str2 = q03.T();
            }
            return new x6.L(str, str2);
        } catch (IllegalStateException e10) {
            throw new RuntimeException("Unable to parse json into type Cellular", e10);
        } catch (NullPointerException e11) {
            throw new RuntimeException("Unable to parse json into type Cellular", e11);
        } catch (NumberFormatException e12) {
            throw new RuntimeException("Unable to parse json into type Cellular", e12);
        }
    }

    public static x6.M N(I8.u uVar) {
        try {
            String T = uVar.q0("test_execution_id").T();
            AbstractC3557B.b0("testExecutionId", T);
            return new x6.M(T);
        } catch (IllegalStateException e10) {
            throw new RuntimeException("Unable to parse json into type CiTest", e10);
        } catch (NullPointerException e11) {
            throw new RuntimeException("Unable to parse json into type CiTest", e11);
        } catch (NumberFormatException e12) {
            throw new RuntimeException("Unable to parse json into type CiTest", e12);
        }
    }

    public static x6.N O(I8.u uVar) {
        Number number;
        try {
            Number M10 = uVar.q0("session_sample_rate").M();
            I8.r q02 = uVar.q0("session_replay_sample_rate");
            if (q02 != null) {
                number = q02.M();
            } else {
                number = null;
            }
            AbstractC3557B.b0("sessionSampleRate", M10);
            return new x6.N(M10, number);
        } catch (IllegalStateException e10) {
            throw new RuntimeException("Unable to parse json into type Configuration", e10);
        } catch (NullPointerException e11) {
            throw new RuntimeException("Unable to parse json into type Configuration", e11);
        } catch (NumberFormatException e12) {
            throw new RuntimeException("Unable to parse json into type Configuration", e12);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006c, code lost:
        r3.add(r11);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static x6.O P(I8.u uVar) {
        int[] h10;
        ArrayList arrayList;
        String T;
        try {
            String T10 = uVar.q0("status").T();
            AbstractC3557B.b0("jsonObject.get(\"status\").asString", T10);
            int i10 = 0;
            for (int i11 : AbstractC6708l.h(3)) {
                if (AbstractC3557B.K(AbstractC6287d.j(i11), T10)) {
                    I8.r q02 = uVar.q0("interfaces");
                    x6.L l10 = null;
                    if (q02 != null) {
                        ArrayList arrayList2 = q02.s().f8131Y;
                        arrayList = new ArrayList(arrayList2.size());
                        Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            String T11 = ((I8.r) it.next()).T();
                            AbstractC3557B.b0("it.asString", T11);
                            EnumC6279a0[] values = EnumC6279a0.values();
                            int length = values.length;
                            for (int i12 = 0; i12 < length; i12++) {
                                EnumC6279a0 enumC6279a0 = values[i12];
                                if (AbstractC3557B.K(enumC6279a0.f49224Y, T11)) {
                                    break;
                                }
                            }
                            throw new NoSuchElementException("Array contains no element matching the predicate.");
                        }
                    }
                    arrayList = null;
                    I8.r q03 = uVar.q0("effective_type");
                    if (q03 != null && (T = q03.T()) != null) {
                        int[] h11 = AbstractC6708l.h(4);
                        int length2 = h11.length;
                        while (i10 < length2) {
                            int i13 = h11[i10];
                            if (AbstractC3557B.K(AbstractC6287d.D(i13), T)) {
                                i10 = i13;
                            } else {
                                i10++;
                            }
                        }
                        throw new NoSuchElementException("Array contains no element matching the predicate.");
                    }
                    I8.r q04 = uVar.q0("cellular");
                    if (q04 != null) {
                        l10 = M(q04.y());
                    }
                    return new x6.O(i11, arrayList, i10, l10);
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        } catch (IllegalStateException e10) {
            throw new RuntimeException("Unable to parse json into type Connectivity", e10);
        } catch (NullPointerException e11) {
            throw new RuntimeException("Unable to parse json into type Connectivity", e11);
        } catch (NumberFormatException e12) {
            throw new RuntimeException("Unable to parse json into type Connectivity", e12);
        }
    }

    public static x6.P Q(I8.u uVar) {
        int[] h10;
        try {
            Q R10 = R(uVar.q0("view").y());
            String T = uVar.q0("source").T();
            AbstractC3557B.b0("jsonObject.get(\"source\").asString", T);
            for (int i10 : AbstractC6708l.h(7)) {
                if (AbstractC3557B.K(AbstractC6287d.b(i10), T)) {
                    return new x6.P(R10, i10);
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        } catch (IllegalStateException e10) {
            throw new RuntimeException("Unable to parse json into type Container", e10);
        } catch (NullPointerException e11) {
            throw new RuntimeException("Unable to parse json into type Container", e11);
        } catch (NumberFormatException e12) {
            throw new RuntimeException("Unable to parse json into type Container", e12);
        }
    }

    public static Q R(I8.u uVar) {
        try {
            String T = uVar.q0(ParameterNames.ID).T();
            AbstractC3557B.b0(ParameterNames.ID, T);
            return new Q(T);
        } catch (IllegalStateException e10) {
            throw new RuntimeException("Unable to parse json into type ContainerView", e10);
        } catch (NullPointerException e11) {
            throw new RuntimeException("Unable to parse json into type ContainerView", e11);
        } catch (NumberFormatException e12) {
            throw new RuntimeException("Unable to parse json into type ContainerView", e12);
        }
    }

    public static S S(I8.u uVar) {
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it = ((K8.j) uVar.f8133Y.entrySet()).iterator();
            while (((K8.k) it).hasNext()) {
                Map.Entry entry = (Map.Entry) ((K8.i) it).next();
                Object key = entry.getKey();
                AbstractC3557B.b0("entry.key", key);
                linkedHashMap.put(key, entry.getValue());
            }
            return new S(linkedHashMap);
        } catch (IllegalStateException e10) {
            throw new RuntimeException("Unable to parse json into type Context", e10);
        } catch (NullPointerException e11) {
            throw new RuntimeException("Unable to parse json into type Context", e11);
        } catch (NumberFormatException e12) {
            throw new RuntimeException("Unable to parse json into type Context", e12);
        }
    }

    public static T T(I8.u uVar) {
        U u10;
        x6.N n10;
        try {
            I8.r q02 = uVar.q0(ParameterNames.SESSION);
            String str = null;
            if (q02 != null) {
                u10 = U(q02.y());
            } else {
                u10 = null;
            }
            I8.r q03 = uVar.q0("configuration");
            if (q03 != null) {
                n10 = O(q03.y());
            } else {
                n10 = null;
            }
            I8.r q04 = uVar.q0("browser_sdk_version");
            if (q04 != null) {
                str = q04.T();
            }
            return new T(u10, n10, str);
        } catch (IllegalStateException e10) {
            throw new RuntimeException("Unable to parse json into type Dd", e10);
        } catch (NullPointerException e11) {
            throw new RuntimeException("Unable to parse json into type Dd", e11);
        } catch (NumberFormatException e12) {
            throw new RuntimeException("Unable to parse json into type Dd", e12);
        }
    }

    public static U U(I8.u uVar) {
        EnumC6288d0 enumC6288d0;
        String T;
        String T10;
        try {
            I8.r q02 = uVar.q0("plan");
            int i10 = 0;
            if (q02 != null && (T10 = q02.T()) != null) {
                EnumC6288d0[] values = EnumC6288d0.values();
                int length = values.length;
                for (int i11 = 0; i11 < length; i11++) {
                    enumC6288d0 = values[i11];
                    if (!AbstractC3557B.K(enumC6288d0.f49278Y.toString(), T10)) {
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
            enumC6288d0 = null;
            I8.r q03 = uVar.q0("session_precondition");
            if (q03 != null && (T = q03.T()) != null) {
                int[] h10 = AbstractC6708l.h(7);
                int length2 = h10.length;
                while (i10 < length2) {
                    int i12 = h10[i10];
                    if (AbstractC3557B.K(AbstractC6287d.h(i12), T)) {
                        i10 = i12;
                    } else {
                        i10++;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
            return new U(enumC6288d0, i10);
        } catch (IllegalStateException e10) {
            throw new RuntimeException("Unable to parse json into type DdSession", e10);
        } catch (NullPointerException e11) {
            throw new RuntimeException("Unable to parse json into type DdSession", e11);
        } catch (NumberFormatException e12) {
            throw new RuntimeException("Unable to parse json into type DdSession", e12);
        }
    }

    public static V V(I8.u uVar) {
        int[] h10;
        String str;
        String str2;
        String str3;
        String str4;
        try {
            String T = uVar.q0("type").T();
            AbstractC3557B.b0("jsonObject.get(\"type\").asString", T);
            for (int i10 : AbstractC6708l.h(7)) {
                if (AbstractC3557B.K(AbstractC6287d.C(i10), T)) {
                    I8.r q02 = uVar.q0("name");
                    if (q02 != null) {
                        str = q02.T();
                    } else {
                        str = null;
                    }
                    I8.r q03 = uVar.q0("model");
                    if (q03 != null) {
                        str2 = q03.T();
                    } else {
                        str2 = null;
                    }
                    I8.r q04 = uVar.q0("brand");
                    if (q04 != null) {
                        str3 = q04.T();
                    } else {
                        str3 = null;
                    }
                    I8.r q05 = uVar.q0("architecture");
                    if (q05 != null) {
                        str4 = q05.T();
                    } else {
                        str4 = null;
                    }
                    return new V(i10, str, str2, str3, str4);
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        } catch (IllegalStateException e10) {
            throw new RuntimeException("Unable to parse json into type Device", e10);
        } catch (NullPointerException e11) {
            throw new RuntimeException("Unable to parse json into type Device", e11);
        } catch (NumberFormatException e12) {
            throw new RuntimeException("Unable to parse json into type Device", e12);
        }
    }

    public static W W(I8.u uVar) {
        C6306j0 c6306j0;
        try {
            I8.r q02 = uVar.q0("viewport");
            if (q02 != null) {
                c6306j0 = U3.f.A(q02.y());
            } else {
                c6306j0 = null;
            }
            return new W(c6306j0);
        } catch (IllegalStateException e10) {
            throw new RuntimeException("Unable to parse json into type Display", e10);
        } catch (NullPointerException e11) {
            throw new RuntimeException("Unable to parse json into type Display", e11);
        } catch (NumberFormatException e12) {
            throw new RuntimeException("Unable to parse json into type Display", e12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0179 A[Catch: NullPointerException -> 0x0169, NumberFormatException -> 0x016c, IllegalStateException -> 0x016e, TRY_LEAVE, TryCatch #6 {IllegalStateException -> 0x016e, NullPointerException -> 0x0169, NumberFormatException -> 0x016c, blocks: (B:75:0x011f, B:78:0x012e, B:79:0x0133, B:80:0x0138, B:93:0x0158, B:95:0x0160, B:103:0x0171, B:105:0x0179, B:107:0x0181, B:108:0x018c, B:110:0x0192, B:113:0x01a9, B:115:0x01b1, B:117:0x01b9, B:118:0x01c4, B:120:0x01ca, B:123:0x01e1, B:125:0x01e9, B:127:0x01f6, B:129:0x01fe, B:131:0x0208, B:133:0x0227, B:134:0x022d, B:135:0x0234), top: B:147:0x0227 }] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01b1 A[Catch: NullPointerException -> 0x0169, NumberFormatException -> 0x016c, IllegalStateException -> 0x016e, TRY_LEAVE, TryCatch #6 {IllegalStateException -> 0x016e, NullPointerException -> 0x0169, NumberFormatException -> 0x016c, blocks: (B:75:0x011f, B:78:0x012e, B:79:0x0133, B:80:0x0138, B:93:0x0158, B:95:0x0160, B:103:0x0171, B:105:0x0179, B:107:0x0181, B:108:0x018c, B:110:0x0192, B:113:0x01a9, B:115:0x01b1, B:117:0x01b9, B:118:0x01c4, B:120:0x01ca, B:123:0x01e1, B:125:0x01e9, B:127:0x01f6, B:129:0x01fe, B:131:0x0208, B:133:0x0227, B:134:0x022d, B:135:0x0234), top: B:147:0x0227 }] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01e9 A[Catch: NullPointerException -> 0x0169, NumberFormatException -> 0x016c, IllegalStateException -> 0x016e, TryCatch #6 {IllegalStateException -> 0x016e, NullPointerException -> 0x0169, NumberFormatException -> 0x016c, blocks: (B:75:0x011f, B:78:0x012e, B:79:0x0133, B:80:0x0138, B:93:0x0158, B:95:0x0160, B:103:0x0171, B:105:0x0179, B:107:0x0181, B:108:0x018c, B:110:0x0192, B:113:0x01a9, B:115:0x01b1, B:117:0x01b9, B:118:0x01c4, B:120:0x01ca, B:123:0x01e1, B:125:0x01e9, B:127:0x01f6, B:129:0x01fe, B:131:0x0208, B:133:0x0227, B:134:0x022d, B:135:0x0234), top: B:147:0x0227 }] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01fe A[Catch: NullPointerException -> 0x0169, NumberFormatException -> 0x016c, IllegalStateException -> 0x016e, TryCatch #6 {IllegalStateException -> 0x016e, NullPointerException -> 0x0169, NumberFormatException -> 0x016c, blocks: (B:75:0x011f, B:78:0x012e, B:79:0x0133, B:80:0x0138, B:93:0x0158, B:95:0x0160, B:103:0x0171, B:105:0x0179, B:107:0x0181, B:108:0x018c, B:110:0x0192, B:113:0x01a9, B:115:0x01b1, B:117:0x01b9, B:118:0x01c4, B:120:0x01ca, B:123:0x01e1, B:125:0x01e9, B:127:0x01f6, B:129:0x01fe, B:131:0x0208, B:133:0x0227, B:134:0x022d, B:135:0x0234), top: B:147:0x0227 }] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0160 A[Catch: NullPointerException -> 0x0169, NumberFormatException -> 0x016c, IllegalStateException -> 0x016e, TryCatch #6 {IllegalStateException -> 0x016e, NullPointerException -> 0x0169, NumberFormatException -> 0x016c, blocks: (B:75:0x011f, B:78:0x012e, B:79:0x0133, B:80:0x0138, B:93:0x0158, B:95:0x0160, B:103:0x0171, B:105:0x0179, B:107:0x0181, B:108:0x018c, B:110:0x0192, B:113:0x01a9, B:115:0x01b1, B:117:0x01b9, B:118:0x01c4, B:120:0x01ca, B:123:0x01e1, B:125:0x01e9, B:127:0x01f6, B:129:0x01fe, B:131:0x0208, B:133:0x0227, B:134:0x022d, B:135:0x0234), top: B:147:0x0227 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static X X(I8.u uVar) {
        IllegalStateException e10;
        NumberFormatException e11;
        String str;
        NullPointerException e12;
        String T;
        int[] h10;
        String str2;
        ArrayList arrayList;
        Boolean bool;
        String str3;
        String str4;
        int i10;
        String str5;
        int i11;
        I8.r q02;
        C6294f0 c6294f0;
        I8.r q03;
        ArrayList arrayList2;
        I8.r q04;
        ArrayList arrayList3;
        I8.r q05;
        Boolean bool2;
        I8.r q06;
        C6282b0 c6282b0;
        String T10;
        String str6 = "Unable to parse json into type Error";
        try {
            try {
                I8.r q07 = uVar.q0(ParameterNames.ID);
                if (q07 != null) {
                    try {
                        T = q07.T();
                    } catch (IllegalStateException e13) {
                        e10 = e13;
                        throw new RuntimeException(str6, e10);
                    } catch (NumberFormatException e14) {
                        e11 = e14;
                        throw new RuntimeException(str6, e11);
                    }
                } else {
                    T = null;
                }
                String T11 = uVar.q0("message").T();
                String T12 = uVar.q0("source").T();
                AbstractC3557B.b0("jsonObject.get(\"source\").asString", T12);
                try {
                    for (int i12 : AbstractC6708l.h(8)) {
                        if (AbstractC3557B.K(AbstractC6287d.d(i12), T12)) {
                            I8.r q08 = uVar.q0("stack");
                            if (q08 != null) {
                                str2 = q08.T();
                            } else {
                                str2 = null;
                            }
                            I8.r q09 = uVar.q0("causes");
                            if (q09 != null) {
                                ArrayList arrayList4 = q09.s().f8131Y;
                                ArrayList arrayList5 = new ArrayList(arrayList4.size());
                                Iterator it = arrayList4.iterator();
                                while (it.hasNext()) {
                                    arrayList5.add(L(((I8.r) it.next()).y()));
                                }
                                arrayList = arrayList5;
                            } else {
                                arrayList = null;
                            }
                            I8.r q010 = uVar.q0("is_crash");
                            if (q010 != null) {
                                bool = Boolean.valueOf(q010.f());
                            } else {
                                bool = null;
                            }
                            I8.r q011 = uVar.q0("fingerprint");
                            if (q011 != null) {
                                str3 = q011.T();
                            } else {
                                str3 = null;
                            }
                            I8.r q012 = uVar.q0("type");
                            if (q012 != null) {
                                str4 = q012.T();
                            } else {
                                str4 = null;
                            }
                            I8.r q013 = uVar.q0(ParameterNames.HANDLING);
                            if (q013 != null && (T10 = q013.T()) != null) {
                                int[] h11 = AbstractC6708l.h(2);
                                int length = h11.length;
                                int i13 = 0;
                                while (i13 < length) {
                                    i10 = h11[i13];
                                    int i14 = length;
                                    if (!AbstractC3557B.K(AbstractC6287d.e(i10), T10)) {
                                        i13++;
                                        length = i14;
                                    }
                                }
                                throw new NoSuchElementException("Array contains no element matching the predicate.");
                            }
                            i10 = 0;
                            I8.r q014 = uVar.q0("handling_stack");
                            if (q014 != null) {
                                str5 = q014.T();
                            } else {
                                str5 = null;
                            }
                            I8.r q015 = uVar.q0("source_type");
                            if (q015 != null) {
                                String T13 = q015.T();
                                if (T13 != null) {
                                    int[] h12 = AbstractC6708l.h(9);
                                    int length2 = h12.length;
                                    int i15 = 0;
                                    while (i15 < length2) {
                                        i11 = h12[i15];
                                        int[] iArr = h12;
                                        if (!AbstractC3557B.K(AbstractC6287d.i(i11), T13)) {
                                            i15++;
                                            h12 = iArr;
                                        } else {
                                            q02 = uVar.q0("resource");
                                            if (q02 == null) {
                                                c6294f0 = R4.b.G0(q02.y());
                                            } else {
                                                c6294f0 = null;
                                            }
                                            q03 = uVar.q0("threads");
                                            if (q03 == null) {
                                                ArrayList arrayList6 = q03.s().f8131Y;
                                                ArrayList arrayList7 = new ArrayList(arrayList6.size());
                                                Iterator it2 = arrayList6.iterator();
                                                while (it2.hasNext()) {
                                                    arrayList7.add(U3.f.z(((I8.r) it2.next()).y()));
                                                }
                                                arrayList2 = arrayList7;
                                            } else {
                                                arrayList2 = null;
                                            }
                                            q04 = uVar.q0("binary_images");
                                            if (q04 == null) {
                                                ArrayList arrayList8 = q04.s().f8131Y;
                                                ArrayList arrayList9 = new ArrayList(arrayList8.size());
                                                Iterator it3 = arrayList8.iterator();
                                                while (it3.hasNext()) {
                                                    arrayList9.add(K(((I8.r) it3.next()).y()));
                                                }
                                                arrayList3 = arrayList9;
                                            } else {
                                                arrayList3 = null;
                                            }
                                            q05 = uVar.q0("was_truncated");
                                            if (q05 == null) {
                                                bool2 = Boolean.valueOf(q05.f());
                                            } else {
                                                bool2 = null;
                                            }
                                            q06 = uVar.q0("meta");
                                            if (q06 == null) {
                                                c6282b0 = R4.b.D0(q06.y());
                                            } else {
                                                c6282b0 = null;
                                            }
                                            AbstractC3557B.b0("message", T11);
                                            return new X(T, T11, i12, str2, arrayList, bool, str3, str4, i10, str5, i11, c6294f0, arrayList2, arrayList3, bool2, c6282b0);
                                        }
                                    }
                                    throw new NoSuchElementException("Array contains no element matching the predicate.");
                                }
                            }
                            i11 = 0;
                            q02 = uVar.q0("resource");
                            if (q02 == null) {
                            }
                            q03 = uVar.q0("threads");
                            if (q03 == null) {
                            }
                            q04 = uVar.q0("binary_images");
                            if (q04 == null) {
                            }
                            q05 = uVar.q0("was_truncated");
                            if (q05 == null) {
                            }
                            q06 = uVar.q0("meta");
                            if (q06 == null) {
                            }
                            AbstractC3557B.b0("message", T11);
                            return new X(T, T11, i12, str2, arrayList, bool, str3, str4, i10, str5, i11, c6294f0, arrayList2, arrayList3, bool2, c6282b0);
                        }
                        try {
                            str = str6;
                        } catch (IllegalStateException e15) {
                            e10 = e15;
                            str6 = str;
                            throw new RuntimeException(str6, e10);
                        } catch (NullPointerException e16) {
                            e12 = e16;
                            throw new RuntimeException(str, e12);
                        } catch (NumberFormatException e17) {
                            e11 = e17;
                            str6 = str;
                            throw new RuntimeException(str6, e11);
                        }
                    }
                    throw new NoSuchElementException("Array contains no element matching the predicate.");
                } catch (IllegalStateException e18) {
                    e10 = e18;
                    str = str6;
                } catch (NumberFormatException e19) {
                    e11 = e19;
                    str = str6;
                }
            } catch (NullPointerException e20) {
                e12 = e20;
                str = str6;
            }
        } catch (IllegalStateException e21) {
            e10 = e21;
        } catch (NumberFormatException e22) {
            e11 = e22;
        }
    }

    public static Y Y(I8.u uVar) {
        int[] h10;
        Boolean bool;
        try {
            String T = uVar.q0(ParameterNames.ID).T();
            String T10 = uVar.q0("type").T();
            AbstractC3557B.b0("jsonObject.get(\"type\").asString", T10);
            for (int i10 : AbstractC6708l.h(3)) {
                if (AbstractC3557B.K(AbstractC6287d.c(i10), T10)) {
                    I8.r q02 = uVar.q0("has_replay");
                    if (q02 != null) {
                        bool = Boolean.valueOf(q02.f());
                    } else {
                        bool = null;
                    }
                    AbstractC3557B.b0(ParameterNames.ID, T);
                    return new Y(T, i10, bool);
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        } catch (IllegalStateException e10) {
            throw new RuntimeException("Unable to parse json into type ErrorEventSession", e10);
        } catch (NullPointerException e11) {
            throw new RuntimeException("Unable to parse json into type ErrorEventSession", e11);
        } catch (NumberFormatException e12) {
            throw new RuntimeException("Unable to parse json into type ErrorEventSession", e12);
        }
    }

    public static Z Z(I8.u uVar) {
        String str;
        String str2;
        Boolean bool;
        try {
            String T = uVar.q0(ParameterNames.ID).T();
            I8.r q02 = uVar.q0("referrer");
            if (q02 != null) {
                str = q02.T();
            } else {
                str = null;
            }
            String T10 = uVar.q0("url").T();
            I8.r q03 = uVar.q0("name");
            if (q03 != null) {
                str2 = q03.T();
            } else {
                str2 = null;
            }
            I8.r q04 = uVar.q0("in_foreground");
            if (q04 != null) {
                bool = Boolean.valueOf(q04.f());
            } else {
                bool = null;
            }
            AbstractC3557B.b0(ParameterNames.ID, T);
            AbstractC3557B.b0("url", T10);
            return new Z(T, str, T10, str2, bool);
        } catch (IllegalStateException e10) {
            throw new RuntimeException("Unable to parse json into type ErrorEventView", e10);
        } catch (NullPointerException e11) {
            throw new RuntimeException("Unable to parse json into type ErrorEventView", e11);
        } catch (NumberFormatException e12) {
            throw new RuntimeException("Unable to parse json into type ErrorEventView", e12);
        }
    }

    public static C6309k0 a0(I8.u uVar) {
        String str;
        String str2;
        String str3;
        C6303i0 c6303i0;
        x6.O o10;
        W w10;
        C6297g0 c6297g0;
        x6.M m10;
        C6285c0 c6285c0;
        V v10;
        S s10;
        x6.H h10;
        x6.P p10;
        S s11;
        String T;
        AbstractC3557B.c0("jsonObject", uVar);
        try {
            long I10 = uVar.q0("date").I();
            x6.I J10 = J(uVar.q0(SIPServerTransaction.CONTENT_TYPE_APPLICATION).y());
            I8.r q02 = uVar.q0(ReferencesHeader.SERVICE);
            if (q02 != null) {
                str = q02.T();
            } else {
                str = null;
            }
            I8.r q03 = uVar.q0(ParameterNames.VERSION);
            if (q03 != null) {
                str2 = q03.T();
            } else {
                str2 = null;
            }
            I8.r q04 = uVar.q0("build_version");
            if (q04 != null) {
                str3 = q04.T();
            } else {
                str3 = null;
            }
            Y Y7 = Y(uVar.q0(ParameterNames.SESSION).y());
            I8.r q05 = uVar.q0("source");
            int i10 = 0;
            if (q05 != null && (T = q05.T()) != null) {
                int[] h11 = AbstractC6708l.h(7);
                int length = h11.length;
                while (i10 < length) {
                    int i11 = h11[i10];
                    if (AbstractC3557B.K(AbstractC6287d.b(i11), T)) {
                        i10 = i11;
                    } else {
                        i10++;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
            Z Z10 = Z(uVar.q0("view").y());
            I8.r q06 = uVar.q0("usr");
            if (q06 != null) {
                c6303i0 = R4.b.I0(q06.y());
            } else {
                c6303i0 = null;
            }
            I8.r q07 = uVar.q0("connectivity");
            if (q07 != null) {
                o10 = P(q07.y());
            } else {
                o10 = null;
            }
            I8.r q08 = uVar.q0("display");
            if (q08 != null) {
                w10 = W(q08.y());
            } else {
                w10 = null;
            }
            I8.r q09 = uVar.q0("synthetics");
            if (q09 != null) {
                c6297g0 = R4.b.H0(q09.y());
            } else {
                c6297g0 = null;
            }
            I8.r q010 = uVar.q0("ci_test");
            if (q010 != null) {
                m10 = N(q010.y());
            } else {
                m10 = null;
            }
            I8.r q011 = uVar.q0("os");
            if (q011 != null) {
                c6285c0 = R4.b.E0(q011.y());
            } else {
                c6285c0 = null;
            }
            I8.r q012 = uVar.q0("device");
            if (q012 != null) {
                v10 = V(q012.y());
            } else {
                v10 = null;
            }
            T T10 = T(uVar.q0("_dd").y());
            I8.r q013 = uVar.q0("context");
            if (q013 != null) {
                s10 = S(q013.y());
            } else {
                s10 = null;
            }
            I8.r q014 = uVar.q0("action");
            if (q014 != null) {
                h10 = I(q014.y());
            } else {
                h10 = null;
            }
            I8.r q015 = uVar.q0("container");
            if (q015 != null) {
                p10 = Q(q015.y());
            } else {
                p10 = null;
            }
            X X10 = X(uVar.q0("error").y());
            I8.r q016 = uVar.q0("feature_flags");
            if (q016 != null) {
                s11 = S(q016.y());
            } else {
                s11 = null;
            }
            return new C6309k0(I10, J10, str, str2, str3, Y7, i10, Z10, c6303i0, o10, w10, c6297g0, m10, c6285c0, v10, T10, s10, h10, p10, X10, s11);
        } catch (IllegalStateException e10) {
            throw new RuntimeException("Unable to parse json into type ErrorEvent", e10);
        } catch (NullPointerException e11) {
            throw new RuntimeException("Unable to parse json into type ErrorEvent", e11);
        } catch (NumberFormatException e12) {
            throw new RuntimeException("Unable to parse json into type ErrorEvent", e12);
        }
    }

    public static boolean d0(C5271a c5271a, String str) {
        Map map;
        Object obj;
        AbstractC3557B.c0("datadogContext", c5271a);
        Map map2 = (Map) c5271a.f43909o.get("session-replay");
        if (map2 == null) {
            return false;
        }
        Object obj2 = map2.get(str);
        Boolean bool = null;
        if (obj2 instanceof Map) {
            map = (Map) obj2;
        } else {
            map = null;
        }
        if (map != null) {
            obj = map.get("has_replay");
        } else {
            obj = null;
        }
        if (obj instanceof Boolean) {
            bool = (Boolean) obj;
        }
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public static pc.K g(AbstractC5137p abstractC5137p) {
        AbstractC3557B.c0("purchaseManagerError", abstractC5137p);
        if (abstractC5137p instanceof C5136o) {
            x8.W.G(Pc.e.a(), "Purchase failed because receipt is already in use", abstractC5137p, 4);
            return new pc.I(abstractC5137p);
        } else if (abstractC5137p instanceof C5135n) {
            return new C5120F(abstractC5137p);
        } else {
            if (abstractC5137p instanceof C5131j) {
                return new C5117C(abstractC5137p);
            }
            if (abstractC5137p instanceof C5132k) {
                return C5118D.f42896i0;
            }
            x8.W.G(Pc.e.a(), "Purchase failed", abstractC5137p, 4);
            return new pc.H(abstractC5137p);
        }
    }

    public static C6284c h(I8.u uVar) {
        int[] h10;
        Boolean bool;
        try {
            String T = uVar.q0(ParameterNames.ID).T();
            String T10 = uVar.q0("type").T();
            AbstractC3557B.b0("jsonObject.get(\"type\").asString", T10);
            for (int i10 : AbstractC6708l.h(3)) {
                if (AbstractC3557B.K(AbstractC6287d.x(i10), T10)) {
                    I8.r q02 = uVar.q0("has_replay");
                    if (q02 != null) {
                        bool = Boolean.valueOf(q02.f());
                    } else {
                        bool = null;
                    }
                    AbstractC3557B.b0(ParameterNames.ID, T);
                    return new C6284c(T, i10, bool);
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        } catch (IllegalStateException e10) {
            throw new RuntimeException("Unable to parse json into type ActionEventSession", e10);
        } catch (NullPointerException e11) {
            throw new RuntimeException("Unable to parse json into type ActionEventSession", e11);
        } catch (NumberFormatException e12) {
            throw new RuntimeException("Unable to parse json into type ActionEventSession", e12);
        }
    }

    public static C6290e i(I8.u uVar) {
        String str;
        String str2;
        Boolean bool;
        try {
            String T = uVar.q0(ParameterNames.ID).T();
            I8.r q02 = uVar.q0("referrer");
            if (q02 != null) {
                str = q02.T();
            } else {
                str = null;
            }
            String T10 = uVar.q0("url").T();
            I8.r q03 = uVar.q0("name");
            if (q03 != null) {
                str2 = q03.T();
            } else {
                str2 = null;
            }
            I8.r q04 = uVar.q0("in_foreground");
            if (q04 != null) {
                bool = Boolean.valueOf(q04.f());
            } else {
                bool = null;
            }
            AbstractC3557B.b0(ParameterNames.ID, T);
            AbstractC3557B.b0("url", T10);
            return new C6290e(T, str, T10, str2, bool);
        } catch (IllegalStateException e10) {
            throw new RuntimeException("Unable to parse json into type ActionEventView", e10);
        } catch (NullPointerException e11) {
            throw new RuntimeException("Unable to parse json into type ActionEventView", e11);
        } catch (NumberFormatException e12) {
            throw new RuntimeException("Unable to parse json into type ActionEventView", e12);
        }
    }

    public static C6293f j(I8.u uVar) {
        try {
            String T = uVar.q0(ParameterNames.ID).T();
            AbstractC3557B.b0(ParameterNames.ID, T);
            return new C6293f(T);
        } catch (IllegalStateException e10) {
            throw new RuntimeException("Unable to parse json into type Application", e10);
        } catch (NullPointerException e11) {
            throw new RuntimeException("Unable to parse json into type Application", e11);
        } catch (NumberFormatException e12) {
            throw new RuntimeException("Unable to parse json into type Application", e12);
        }
    }

    public static C6296g k(I8.u uVar) {
        String str;
        try {
            I8.r q02 = uVar.q0("technology");
            String str2 = null;
            if (q02 != null) {
                str = q02.T();
            } else {
                str = null;
            }
            I8.r q03 = uVar.q0("carrier_name");
            if (q03 != null) {
                str2 = q03.T();
            }
            return new C6296g(str, str2);
        } catch (IllegalStateException e10) {
            throw new RuntimeException("Unable to parse json into type Cellular", e10);
        } catch (NullPointerException e11) {
            throw new RuntimeException("Unable to parse json into type Cellular", e11);
        } catch (NumberFormatException e12) {
            throw new RuntimeException("Unable to parse json into type Cellular", e12);
        }
    }

    public static C6299h l(I8.u uVar) {
        try {
            String T = uVar.q0("test_execution_id").T();
            AbstractC3557B.b0("testExecutionId", T);
            return new C6299h(T);
        } catch (IllegalStateException e10) {
            throw new RuntimeException("Unable to parse json into type CiTest", e10);
        } catch (NullPointerException e11) {
            throw new RuntimeException("Unable to parse json into type CiTest", e11);
        } catch (NumberFormatException e12) {
            throw new RuntimeException("Unable to parse json into type CiTest", e12);
        }
    }

    public static C6302i m(I8.u uVar) {
        Number number;
        try {
            Number M10 = uVar.q0("session_sample_rate").M();
            I8.r q02 = uVar.q0("session_replay_sample_rate");
            if (q02 != null) {
                number = q02.M();
            } else {
                number = null;
            }
            AbstractC3557B.b0("sessionSampleRate", M10);
            return new C6302i(M10, number);
        } catch (IllegalStateException e10) {
            throw new RuntimeException("Unable to parse json into type Configuration", e10);
        } catch (NullPointerException e11) {
            throw new RuntimeException("Unable to parse json into type Configuration", e11);
        } catch (NumberFormatException e12) {
            throw new RuntimeException("Unable to parse json into type Configuration", e12);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006c, code lost:
        r3.add(r11);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C6305j n(I8.u uVar) {
        int[] h10;
        ArrayList arrayList;
        String T;
        try {
            String T10 = uVar.q0("status").T();
            AbstractC3557B.b0("jsonObject.get(\"status\").asString", T10);
            int i10 = 0;
            for (int i11 : AbstractC6708l.h(3)) {
                if (AbstractC3557B.K(AbstractC6287d.B(i11), T10)) {
                    I8.r q02 = uVar.q0("interfaces");
                    C6296g c6296g = null;
                    if (q02 != null) {
                        ArrayList arrayList2 = q02.s().f8131Y;
                        arrayList = new ArrayList(arrayList2.size());
                        Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            String T11 = ((I8.r) it.next()).T();
                            AbstractC3557B.b0("it.asString", T11);
                            EnumC6343w[] values = EnumC6343w.values();
                            int length = values.length;
                            for (int i12 = 0; i12 < length; i12++) {
                                EnumC6343w enumC6343w = values[i12];
                                if (AbstractC3557B.K(enumC6343w.f49462Y, T11)) {
                                    break;
                                }
                            }
                            throw new NoSuchElementException("Array contains no element matching the predicate.");
                        }
                    }
                    arrayList = null;
                    I8.r q03 = uVar.q0("effective_type");
                    if (q03 != null && (T = q03.T()) != null) {
                        int[] h11 = AbstractC6708l.h(4);
                        int length2 = h11.length;
                        while (i10 < length2) {
                            int i13 = h11[i10];
                            if (AbstractC3557B.K(AbstractC6287d.z(i13), T)) {
                                i10 = i13;
                            } else {
                                i10++;
                            }
                        }
                        throw new NoSuchElementException("Array contains no element matching the predicate.");
                    }
                    I8.r q04 = uVar.q0("cellular");
                    if (q04 != null) {
                        c6296g = k(q04.y());
                    }
                    return new C6305j(i11, arrayList, i10, c6296g);
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        } catch (IllegalStateException e10) {
            throw new RuntimeException("Unable to parse json into type Connectivity", e10);
        } catch (NullPointerException e11) {
            throw new RuntimeException("Unable to parse json into type Connectivity", e11);
        } catch (NumberFormatException e12) {
            throw new RuntimeException("Unable to parse json into type Connectivity", e12);
        }
    }

    public static C6308k o(I8.u uVar) {
        int[] h10;
        try {
            C6311l p10 = p(uVar.q0("view").y());
            String T = uVar.q0("source").T();
            AbstractC3557B.b0("jsonObject.get(\"source\").asString", T);
            for (int i10 : AbstractC6708l.h(7)) {
                if (AbstractC3557B.K(AbstractC6287d.a(i10), T)) {
                    return new C6308k(p10, i10);
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        } catch (IllegalStateException e10) {
            throw new RuntimeException("Unable to parse json into type Container", e10);
        } catch (NullPointerException e11) {
            throw new RuntimeException("Unable to parse json into type Container", e11);
        } catch (NumberFormatException e12) {
            throw new RuntimeException("Unable to parse json into type Container", e12);
        }
    }

    public static C6311l p(I8.u uVar) {
        try {
            String T = uVar.q0(ParameterNames.ID).T();
            AbstractC3557B.b0(ParameterNames.ID, T);
            return new C6311l(T);
        } catch (IllegalStateException e10) {
            throw new RuntimeException("Unable to parse json into type ContainerView", e10);
        } catch (NullPointerException e11) {
            throw new RuntimeException("Unable to parse json into type ContainerView", e11);
        } catch (NumberFormatException e12) {
            throw new RuntimeException("Unable to parse json into type ContainerView", e12);
        }
    }

    public static C6314m q(I8.u uVar) {
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it = ((K8.j) uVar.f8133Y.entrySet()).iterator();
            while (((K8.k) it).hasNext()) {
                Map.Entry entry = (Map.Entry) ((K8.i) it).next();
                Object key = entry.getKey();
                AbstractC3557B.b0("entry.key", key);
                linkedHashMap.put(key, entry.getValue());
            }
            return new C6314m(linkedHashMap);
        } catch (IllegalStateException e10) {
            throw new RuntimeException("Unable to parse json into type Context", e10);
        } catch (NullPointerException e11) {
            throw new RuntimeException("Unable to parse json into type Context", e11);
        } catch (NumberFormatException e12) {
            throw new RuntimeException("Unable to parse json into type Context", e12);
        }
    }

    public static C6317n r(I8.u uVar) {
        try {
            return new C6317n(uVar.q0("count").I());
        } catch (IllegalStateException e10) {
            throw new RuntimeException("Unable to parse json into type Crash", e10);
        } catch (NullPointerException e11) {
            throw new RuntimeException("Unable to parse json into type Crash", e11);
        } catch (NumberFormatException e12) {
            throw new RuntimeException("Unable to parse json into type Crash", e12);
        }
    }

    public static C6320o s(I8.u uVar) {
        x6.r rVar;
        C6302i c6302i;
        String str;
        try {
            I8.r q02 = uVar.q0(ParameterNames.SESSION);
            C6323p c6323p = null;
            if (q02 != null) {
                rVar = v(q02.y());
            } else {
                rVar = null;
            }
            I8.r q03 = uVar.q0("configuration");
            if (q03 != null) {
                c6302i = m(q03.y());
            } else {
                c6302i = null;
            }
            I8.r q04 = uVar.q0("browser_sdk_version");
            if (q04 != null) {
                str = q04.T();
            } else {
                str = null;
            }
            I8.r q05 = uVar.q0("action");
            if (q05 != null) {
                c6323p = t(q05.y());
            }
            return new C6320o(rVar, c6302i, str, c6323p);
        } catch (IllegalStateException e10) {
            throw new RuntimeException("Unable to parse json into type Dd", e10);
        } catch (NullPointerException e11) {
            throw new RuntimeException("Unable to parse json into type Dd", e11);
        } catch (NumberFormatException e12) {
            throw new RuntimeException("Unable to parse json into type Dd", e12);
        }
    }

    public static C6323p t(I8.u uVar) {
        C6277A c6277a;
        try {
            I8.r q02 = uVar.q0("position");
            C6326q c6326q = null;
            if (q02 != null) {
                c6277a = C(q02.y());
            } else {
                c6277a = null;
            }
            I8.r q03 = uVar.q0("target");
            if (q03 != null) {
                c6326q = u(q03.y());
            }
            return new C6323p(c6277a, c6326q);
        } catch (IllegalStateException e10) {
            throw new RuntimeException("Unable to parse json into type DdAction", e10);
        } catch (NullPointerException e11) {
            throw new RuntimeException("Unable to parse json into type DdAction", e11);
        } catch (NumberFormatException e12) {
            throw new RuntimeException("Unable to parse json into type DdAction", e12);
        }
    }

    public static C6326q u(I8.u uVar) {
        String str;
        Long l10;
        try {
            I8.r q02 = uVar.q0("selector");
            Long l11 = null;
            if (q02 != null) {
                str = q02.T();
            } else {
                str = null;
            }
            I8.r q03 = uVar.q0("width");
            if (q03 != null) {
                l10 = Long.valueOf(q03.I());
            } else {
                l10 = null;
            }
            I8.r q04 = uVar.q0("height");
            if (q04 != null) {
                l11 = Long.valueOf(q04.I());
            }
            return new C6326q(str, l10, l11);
        } catch (IllegalStateException e10) {
            throw new RuntimeException("Unable to parse json into type DdActionTarget", e10);
        } catch (NullPointerException e11) {
            throw new RuntimeException("Unable to parse json into type DdActionTarget", e11);
        } catch (NumberFormatException e12) {
            throw new RuntimeException("Unable to parse json into type DdActionTarget", e12);
        }
    }

    public static x6.r v(I8.u uVar) {
        EnumC6352z enumC6352z;
        String T;
        String T10;
        try {
            I8.r q02 = uVar.q0("plan");
            int i10 = 0;
            if (q02 != null && (T10 = q02.T()) != null) {
                EnumC6352z[] values = EnumC6352z.values();
                int length = values.length;
                for (int i11 = 0; i11 < length; i11++) {
                    enumC6352z = values[i11];
                    if (!AbstractC3557B.K(enumC6352z.f49487Y.toString(), T10)) {
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
            enumC6352z = null;
            I8.r q03 = uVar.q0("session_precondition");
            if (q03 != null && (T = q03.T()) != null) {
                int[] h10 = AbstractC6708l.h(7);
                int length2 = h10.length;
                while (i10 < length2) {
                    int i12 = h10[i10];
                    if (AbstractC3557B.K(AbstractC6287d.A(i12), T)) {
                        i10 = i12;
                    } else {
                        i10++;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
            return new x6.r(enumC6352z, i10);
        } catch (IllegalStateException e10) {
            throw new RuntimeException("Unable to parse json into type DdSession", e10);
        } catch (NullPointerException e11) {
            throw new RuntimeException("Unable to parse json into type DdSession", e11);
        } catch (NumberFormatException e12) {
            throw new RuntimeException("Unable to parse json into type DdSession", e12);
        }
    }

    public static C6331s w(I8.u uVar) {
        int[] h10;
        String str;
        String str2;
        String str3;
        String str4;
        try {
            String T = uVar.q0("type").T();
            AbstractC3557B.b0("jsonObject.get(\"type\").asString", T);
            for (int i10 : AbstractC6708l.h(7)) {
                if (AbstractC3557B.K(AbstractC6287d.y(i10), T)) {
                    I8.r q02 = uVar.q0("name");
                    if (q02 != null) {
                        str = q02.T();
                    } else {
                        str = null;
                    }
                    I8.r q03 = uVar.q0("model");
                    if (q03 != null) {
                        str2 = q03.T();
                    } else {
                        str2 = null;
                    }
                    I8.r q04 = uVar.q0("brand");
                    if (q04 != null) {
                        str3 = q04.T();
                    } else {
                        str3 = null;
                    }
                    I8.r q05 = uVar.q0("architecture");
                    if (q05 != null) {
                        str4 = q05.T();
                    } else {
                        str4 = null;
                    }
                    return new C6331s(i10, str, str2, str3, str4);
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        } catch (IllegalStateException e10) {
            throw new RuntimeException("Unable to parse json into type Device", e10);
        } catch (NullPointerException e11) {
            throw new RuntimeException("Unable to parse json into type Device", e11);
        } catch (NumberFormatException e12) {
            throw new RuntimeException("Unable to parse json into type Device", e12);
        }
    }

    public static C6334t x(I8.u uVar) {
        x6.F f6;
        try {
            I8.r q02 = uVar.q0("viewport");
            if (q02 != null) {
                f6 = G(q02.y());
            } else {
                f6 = null;
            }
            return new C6334t(f6);
        } catch (IllegalStateException e10) {
            throw new RuntimeException("Unable to parse json into type Display", e10);
        } catch (NullPointerException e11) {
            throw new RuntimeException("Unable to parse json into type Display", e11);
        } catch (NumberFormatException e12) {
            throw new RuntimeException("Unable to parse json into type Display", e12);
        }
    }

    public static C6337u y(I8.u uVar) {
        try {
            return new C6337u(uVar.q0("count").I());
        } catch (IllegalStateException e10) {
            throw new RuntimeException("Unable to parse json into type Error", e10);
        } catch (NullPointerException e11) {
            throw new RuntimeException("Unable to parse json into type Error", e11);
        } catch (NumberFormatException e12) {
            throw new RuntimeException("Unable to parse json into type Error", e12);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0042, code lost:
        r1.add(r6);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C6340v z(I8.u uVar) {
        try {
            ArrayList arrayList = uVar.q0("type").s().f8131Y;
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String T = ((I8.r) it.next()).T();
                AbstractC3557B.b0("it.asString", T);
                x6.D[] values = x6.D.values();
                int length = values.length;
                for (int i10 = 0; i10 < length; i10++) {
                    x6.D d10 = values[i10];
                    if (AbstractC3557B.K(d10.f48935Y, T)) {
                        break;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
            return new C6340v(arrayList2);
        } catch (IllegalStateException e10) {
            throw new RuntimeException("Unable to parse json into type Frustration", e10);
        } catch (NullPointerException e11) {
            throw new RuntimeException("Unable to parse json into type Frustration", e11);
        } catch (NumberFormatException e12) {
            throw new RuntimeException("Unable to parse json into type Frustration", e12);
        }
    }

    @Override // o4.m
    public o4.d a(o4.c cVar) {
        return null;
    }

    public String b0(String str) {
        AbstractC3557B.c0("input", str);
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            byte[] bytes = str.getBytes(Lg.a.f11131a);
            AbstractC3557B.b0("this as java.lang.String).getBytes(charset)", bytes);
            messageDigest.update(bytes);
            byte[] digest = messageDigest.digest();
            AbstractC3557B.b0("hashBytes", digest);
            return kf.q.q3(digest, "", C6543b.f50766h0, 30);
        } catch (NoSuchAlgorithmException e10) {
            P4.a.m0(Q5.c.f14433a, 5, EnumC5090b.f42738Y, C6544c.f50772k0, e10, false, 48);
            return null;
        }
    }

    @Override // p4.f
    public boolean c() {
        return true;
    }

    public com.auth0.android.request.internal.c c0() {
        if (com.auth0.android.request.internal.c.f26726c != null) {
            com.auth0.android.request.internal.c cVar = com.auth0.android.request.internal.c.f26726c;
            AbstractC3557B.Z(cVar);
            return cVar;
        }
        synchronized (this) {
            if (com.auth0.android.request.internal.c.f26726c == null) {
                com.auth0.android.request.internal.c.f26726c = new com.auth0.android.request.internal.c(new com.auth0.android.request.internal.d());
            }
        }
        com.auth0.android.request.internal.c cVar2 = com.auth0.android.request.internal.c.f26726c;
        AbstractC3557B.Z(cVar2);
        return cVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0051 A[Catch: Exception -> 0x002b, TryCatch #0 {Exception -> 0x002b, blocks: (B:12:0x0027, B:17:0x0037, B:19:0x003e, B:22:0x004b, B:25:0x0051, B:28:0x005e), top: B:31:0x0021 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Serializable e(me.T t10, AbstractC4825e abstractC4825e) {
        Wc.a aVar;
        int i10;
        Serializable serializable;
        try {
            if (abstractC4825e instanceof Wc.a) {
                aVar = (Wc.a) abstractC4825e;
                int i11 = aVar.f20894i0;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    aVar.f20894i0 = i11 - Integer.MIN_VALUE;
                    Object obj = aVar.f20892Z;
                    EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                    i10 = aVar.f20894i0;
                    if (i10 == 0) {
                        if (i10 != 1) {
                            if (i10 == 2) {
                                com.google.android.gms.internal.play_billing.N.B0(obj);
                                serializable = (Wc.b) obj;
                                return serializable;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        t10 = aVar.f20891Y;
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                    } else {
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                        Ii.q qVar = Wc.p.f20919i0;
                        aVar.f20891Y = t10;
                        aVar.f20894i0 = 1;
                        obj = qVar.j(t10, aVar);
                        if (obj == enumC5000a) {
                            return enumC5000a;
                        }
                    }
                    serializable = (Wc.p) obj;
                    if (serializable == null) {
                        Wc.d dVar = Wc.h.f20905h0;
                        aVar.f20891Y = null;
                        aVar.f20894i0 = 2;
                        obj = dVar.a(t10, aVar);
                        if (obj == enumC5000a) {
                            return enumC5000a;
                        }
                        serializable = (Wc.b) obj;
                    }
                    return serializable;
                }
            }
            if (i10 == 0) {
            }
            serializable = (Wc.p) obj;
            if (serializable == null) {
            }
            return serializable;
        } catch (Exception e10) {
            x8.W.W(Pc.e.a(), "Unexpected exception parsing Cloudflare error response", e10, null, 4);
            return null;
        }
        aVar = new Wc.a(this, abstractC4825e);
        Object obj2 = aVar.f20892Z;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = aVar.f20894i0;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object f(me.T t10, AbstractC4825e abstractC4825e) {
        C1485a c1485a;
        Object obj;
        int i10;
        if (abstractC4825e instanceof C1485a) {
            c1485a = (C1485a) abstractC4825e;
            int i11 = c1485a.f18530i0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c1485a.f18530i0 = i11 - Integer.MIN_VALUE;
                obj = c1485a.f18528Z;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = c1485a.f18530i0;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            com.google.android.gms.internal.play_billing.N.B0(obj);
                            return obj;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t10 = c1485a.f18527Y;
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    Vc.d dVar = Vc.e.Companion;
                    c1485a.f18527Y = t10;
                    c1485a.f18530i0 = 1;
                    obj = dVar.a(t10, c1485a);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                }
                obj = (Vc.j) obj;
                if (obj == null) {
                    Vc.h hVar = Vc.i.Companion;
                    c1485a.f18527Y = null;
                    c1485a.f18530i0 = 2;
                    obj = hVar.a(t10, c1485a);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                }
                return obj;
            }
        }
        c1485a = new C1485a(this, abstractC4825e);
        obj = c1485a.f18528Z;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = c1485a.f18530i0;
        if (i10 == 0) {
        }
        obj = (Vc.j) obj;
        if (obj == null) {
        }
        return obj;
    }

    @Override // p4.f
    public void shutdown() {
    }

    @Override // o4.m
    public void b(int i10) {
    }

    @Override // o4.m
    public void d(o4.c cVar, Bitmap bitmap, Map map, int i10) {
    }
}
