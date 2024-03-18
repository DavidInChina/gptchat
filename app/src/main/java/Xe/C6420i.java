package xe;

import id.AbstractC3557B;

/* renamed from: xe.i  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6420i {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f49898a;

    /* renamed from: b  reason: collision with root package name */
    public Integer f49899b;

    /* renamed from: c  reason: collision with root package name */
    public Integer f49900c;

    /* renamed from: d  reason: collision with root package name */
    public Integer f49901d;

    /* renamed from: e  reason: collision with root package name */
    public Integer f49902e;

    /* renamed from: f  reason: collision with root package name */
    public He.e f49903f;

    /* renamed from: g  reason: collision with root package name */
    public Integer f49904g;

    public /* synthetic */ C6420i(int i10) {
        this.f49898a = i10;
    }

    public final He.b a() {
        He.e eVar;
        int i10 = this.f49898a;
        switch (i10) {
            case 0:
                Integer num = this.f49899b;
                AbstractC3557B.Z(num);
                int intValue = num.intValue();
                Integer num2 = this.f49900c;
                AbstractC3557B.Z(num2);
                int intValue2 = num2.intValue();
                Integer num3 = this.f49901d;
                AbstractC3557B.Z(num3);
                int intValue3 = num3.intValue();
                Integer num4 = this.f49902e;
                AbstractC3557B.Z(num4);
                int intValue4 = num4.intValue();
                He.e eVar2 = this.f49903f;
                AbstractC3557B.Z(eVar2);
                Integer num5 = this.f49904g;
                AbstractC3557B.Z(num5);
                return He.a.a(intValue, intValue2, intValue3, intValue4, eVar2, num5.intValue());
            default:
                Integer num6 = this.f49899b;
                AbstractC3557B.Z(num6);
                int intValue5 = num6.intValue();
                Integer num7 = this.f49900c;
                AbstractC3557B.Z(num7);
                int intValue6 = num7.intValue();
                Integer num8 = this.f49901d;
                AbstractC3557B.Z(num8);
                int intValue7 = num8.intValue();
                Integer num9 = this.f49902e;
                AbstractC3557B.Z(num9);
                int intValue8 = num9.intValue();
                switch (i10) {
                    case 0:
                        eVar = this.f49903f;
                        break;
                    default:
                        eVar = this.f49903f;
                        if (eVar == null) {
                            AbstractC3557B.C2("month");
                            throw null;
                        }
                        break;
                }
                He.e eVar3 = eVar;
                Integer num10 = this.f49904g;
                AbstractC3557B.Z(num10);
                return He.a.a(intValue5, intValue6, intValue7, intValue8, eVar3, num10.intValue());
        }
    }
}
