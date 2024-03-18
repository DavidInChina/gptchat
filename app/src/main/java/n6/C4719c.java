package n6;

import A.AbstractC0044t0;
import B6.i;
import B6.j;
import B6.k;
import B6.l;
import B6.m;
import B6.n;
import B6.o;
import B6.p;
import B6.r;
import B6.s;
import B6.t;
import I8.u;
import I8.v;
import I8.w;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.gov.nist.javax.sip.header.extensions.ReferencesHeader;
import android.gov.nist.javax.sip.stack.SIPServerTransaction;
import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import k5.F;
import l8.AbstractC4344b;
import p5.AbstractC5091c;
import p5.EnumC5090b;
import x6.R1;
import z.AbstractC6708l;

/* renamed from: n6.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4719c implements F5.h {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC5091c f39631a;

    public C4719c(AbstractC5091c abstractC5091c) {
        AbstractC3557B.c0("internalLogger", abstractC5091c);
        this.f39631a = abstractC5091c;
    }

    public static Object b(u uVar, String str) {
        String str2;
        IllegalStateException e10;
        String str3;
        NumberFormatException e11;
        String str4;
        NullPointerException e12;
        int i10;
        p pVar;
        r rVar;
        t tVar;
        o oVar;
        ArrayList arrayList;
        String str5;
        IllegalStateException e13;
        String str6;
        NumberFormatException e14;
        String str7;
        NullPointerException e15;
        j jVar;
        k kVar;
        m mVar;
        i iVar;
        ArrayList arrayList2;
        if (str != null) {
            switch (str.hashCode()) {
                case -1422950858:
                    if (str.equals("action")) {
                        return F.H(uVar);
                    }
                    break;
                case -341064690:
                    if (str.equals("resource")) {
                        return U3.f.Q(uVar);
                    }
                    break;
                case 3619493:
                    if (str.equals("view")) {
                        return N.V(uVar);
                    }
                    break;
                case 96784904:
                    if (str.equals("error")) {
                        return F.a0(uVar);
                    }
                    break;
                case 128111976:
                    if (str.equals("long_task")) {
                        return R4.b.U0(uVar);
                    }
                    break;
                case 780346297:
                    if (str.equals("telemetry")) {
                        String T = ((w) ((u) uVar.f8133Y.get("telemetry")).f8133Y.get("status")).T();
                        if (AbstractC3557B.K(T, "debug")) {
                            try {
                                str7 = "Unable to parse json into type TelemetryDebugEvent";
                            } catch (IllegalStateException e16) {
                                e13 = e16;
                                str5 = "Unable to parse json into type TelemetryDebugEvent";
                            } catch (NullPointerException e17) {
                                e15 = e17;
                                str7 = "Unable to parse json into type TelemetryDebugEvent";
                            } catch (NumberFormatException e18) {
                                e14 = e18;
                                str6 = "Unable to parse json into type TelemetryDebugEvent";
                            }
                            try {
                                I2.i iVar2 = new I2.i(3, 0);
                                long I10 = uVar.q0("date").I();
                                String T10 = uVar.q0(ReferencesHeader.SERVICE).T();
                                String T11 = uVar.q0("source").T();
                                AbstractC3557B.b0("jsonObject.get(\"source\").asString", T11);
                                int[] h10 = AbstractC6708l.h(6);
                                int length = h10.length;
                                int i11 = 0;
                                while (i11 < length) {
                                    int i12 = h10[i11];
                                    int[] iArr = h10;
                                    if (AbstractC3557B.K(AbstractC0044t0.n(i12), T11)) {
                                        String T12 = uVar.q0(ParameterNames.VERSION).T();
                                        I8.r q02 = uVar.q0(SIPServerTransaction.CONTENT_TYPE_APPLICATION);
                                        if (q02 != null) {
                                            jVar = R1.d(q02.y());
                                        } else {
                                            jVar = null;
                                        }
                                        I8.r q03 = uVar.q0(ParameterNames.SESSION);
                                        if (q03 != null) {
                                            kVar = R1.e(q03.y());
                                        } else {
                                            kVar = null;
                                        }
                                        I8.r q04 = uVar.q0("view");
                                        if (q04 != null) {
                                            mVar = AbstractC4344b.l0(q04.y());
                                        } else {
                                            mVar = null;
                                        }
                                        I8.r q05 = uVar.q0("action");
                                        if (q05 != null) {
                                            iVar = AbstractC4344b.k0(q05.y());
                                        } else {
                                            iVar = null;
                                        }
                                        I8.r q06 = uVar.q0("experimental_features");
                                        if (q06 != null) {
                                            ArrayList arrayList3 = q06.s().f8131Y;
                                            ArrayList arrayList4 = new ArrayList(arrayList3.size());
                                            Iterator it = arrayList3.iterator();
                                            while (it.hasNext()) {
                                                arrayList4.add(((I8.r) it.next()).T());
                                            }
                                            arrayList2 = arrayList4;
                                        } else {
                                            arrayList2 = null;
                                        }
                                        l f6 = l.f1945e.f(uVar.q0("telemetry").y());
                                        AbstractC3557B.b0(ReferencesHeader.SERVICE, T10);
                                        AbstractC3557B.b0(ParameterNames.VERSION, T12);
                                        return new n(iVar2, I10, T10, i12, T12, jVar, kVar, mVar, iVar, arrayList2, f6);
                                    }
                                    i11++;
                                    h10 = iArr;
                                }
                                throw new NoSuchElementException("Array contains no element matching the predicate.");
                            } catch (IllegalStateException e19) {
                                e13 = e19;
                                str5 = str7;
                                throw new RuntimeException(str5, e13);
                            } catch (NullPointerException e20) {
                                e15 = e20;
                                throw new RuntimeException(str7, e15);
                            } catch (NumberFormatException e21) {
                                e14 = e21;
                                str6 = str7;
                                throw new RuntimeException(str6, e14);
                            }
                        } else if (AbstractC3557B.K(T, "error")) {
                            try {
                                str4 = "Unable to parse json into type TelemetryErrorEvent";
                                i10 = 0;
                            } catch (IllegalStateException e22) {
                                e10 = e22;
                                str2 = "Unable to parse json into type TelemetryErrorEvent";
                            } catch (NullPointerException e23) {
                                e12 = e23;
                                str4 = "Unable to parse json into type TelemetryErrorEvent";
                            } catch (NumberFormatException e24) {
                                e11 = e24;
                                str3 = "Unable to parse json into type TelemetryErrorEvent";
                            }
                            try {
                                I2.i iVar3 = new I2.i(4, 0);
                                long I11 = uVar.q0("date").I();
                                String T13 = uVar.q0(ReferencesHeader.SERVICE).T();
                                String T14 = uVar.q0("source").T();
                                AbstractC3557B.b0("jsonObject.get(\"source\").asString", T14);
                                int[] h11 = AbstractC6708l.h(6);
                                int length2 = h11.length;
                                while (i10 < length2) {
                                    int i13 = h11[i10];
                                    int[] iArr2 = h11;
                                    if (AbstractC3557B.K(AbstractC0044t0.o(i13), T14)) {
                                        String T15 = uVar.q0(ParameterNames.VERSION).T();
                                        I8.r q07 = uVar.q0(SIPServerTransaction.CONTENT_TYPE_APPLICATION);
                                        if (q07 != null) {
                                            pVar = AbstractC4344b.m0(q07.y());
                                        } else {
                                            pVar = null;
                                        }
                                        I8.r q08 = uVar.q0(ParameterNames.SESSION);
                                        if (q08 != null) {
                                            rVar = R1.h(q08.y());
                                        } else {
                                            rVar = null;
                                        }
                                        I8.r q09 = uVar.q0("view");
                                        if (q09 != null) {
                                            tVar = AbstractC4344b.o0(q09.y());
                                        } else {
                                            tVar = null;
                                        }
                                        I8.r q010 = uVar.q0("action");
                                        if (q010 != null) {
                                            oVar = R1.g(q010.y());
                                        } else {
                                            oVar = null;
                                        }
                                        I8.r q011 = uVar.q0("experimental_features");
                                        if (q011 != null) {
                                            ArrayList arrayList5 = q011.s().f8131Y;
                                            ArrayList arrayList6 = new ArrayList(arrayList5.size());
                                            Iterator it2 = arrayList5.iterator();
                                            while (it2.hasNext()) {
                                                arrayList6.add(((I8.r) it2.next()).T());
                                            }
                                            arrayList = arrayList6;
                                        } else {
                                            arrayList = null;
                                        }
                                        s i14 = R1.i(uVar.q0("telemetry").y());
                                        AbstractC3557B.b0(ReferencesHeader.SERVICE, T13);
                                        AbstractC3557B.b0(ParameterNames.VERSION, T15);
                                        return new B6.u(iVar3, I11, T13, i13, T15, pVar, rVar, tVar, oVar, arrayList, i14);
                                    }
                                    i10++;
                                    h11 = iArr2;
                                }
                                throw new NoSuchElementException("Array contains no element matching the predicate.");
                            } catch (IllegalStateException e25) {
                                e10 = e25;
                                str2 = str4;
                                throw new RuntimeException(str2, e10);
                            } catch (NullPointerException e26) {
                                e12 = e26;
                                throw new RuntimeException(str4, e12);
                            } catch (NumberFormatException e27) {
                                e11 = e27;
                                str3 = str4;
                                throw new RuntimeException(str3, e11);
                            }
                        } else {
                            throw new RuntimeException(R.a.r("We could not deserialize the telemetry event with status: ", T));
                        }
                    }
                    break;
            }
        }
        throw new RuntimeException(R.a.r("We could not deserialize the event with type: ", str));
    }

    @Override // F5.h
    public final Object a(Object obj) {
        String str;
        u uVar = (u) obj;
        EnumC5090b enumC5090b = EnumC5090b.f42740h0;
        EnumC5090b enumC5090b2 = EnumC5090b.f42739Z;
        AbstractC3557B.c0("model", uVar);
        try {
            w wVar = (w) uVar.f8133Y.get("type");
            if (wVar != null) {
                str = wVar.T();
            } else {
                str = null;
            }
            return b(uVar, str);
        } catch (v e10) {
            P4.a.l0(this.f39631a, 5, AbstractC4344b.G0(enumC5090b2, enumC5090b), new C4718b(uVar, 0), e10, 48);
            return null;
        } catch (IllegalStateException e11) {
            P4.a.l0(this.f39631a, 5, AbstractC4344b.G0(enumC5090b2, enumC5090b), new C4718b(uVar, 1), e11, 48);
            return null;
        }
    }
}
