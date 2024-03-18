package S3;

import L3.s;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class a extends d {

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ int f16111g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, X3.b bVar, int i10) {
        super(context, bVar);
        this.f16111g = i10;
        if (i10 != 1) {
            if (i10 != 2) {
                AbstractC3557B.c0("taskExecutor", bVar);
                return;
            }
            AbstractC3557B.c0("taskExecutor", bVar);
            super(context, bVar);
            return;
        }
        AbstractC3557B.c0("taskExecutor", bVar);
        super(context, bVar);
    }

    @Override // S3.f
    public final /* bridge */ /* synthetic */ Object a() {
        switch (this.f16111g) {
            case 0:
                return g();
            case 1:
                return g();
            default:
                return g();
        }
    }

    @Override // S3.d
    public final IntentFilter e() {
        switch (this.f16111g) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.CHARGING");
                intentFilter.addAction("android.os.action.DISCHARGING");
                return intentFilter;
            case 1:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.BATTERY_OKAY");
                intentFilter2.addAction("android.intent.action.BATTERY_LOW");
                return intentFilter2;
            default:
                IntentFilter intentFilter3 = new IntentFilter();
                intentFilter3.addAction("android.intent.action.DEVICE_STORAGE_OK");
                intentFilter3.addAction("android.intent.action.DEVICE_STORAGE_LOW");
                return intentFilter3;
        }
    }

    @Override // S3.d
    public final void f(Intent intent) {
        switch (this.f16111g) {
            case 0:
                AbstractC3557B.c0("intent", intent);
                String action = intent.getAction();
                if (action != null) {
                    s.d().a(b.f16112a, "Received ".concat(action));
                    switch (action.hashCode()) {
                        case -1886648615:
                            if (action.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                                b(Boolean.FALSE);
                                return;
                            }
                            return;
                        case -54942926:
                            if (action.equals("android.os.action.DISCHARGING")) {
                                b(Boolean.FALSE);
                                return;
                            }
                            return;
                        case 948344062:
                            if (action.equals("android.os.action.CHARGING")) {
                                b(Boolean.TRUE);
                                return;
                            }
                            return;
                        case 1019184907:
                            if (action.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                                b(Boolean.TRUE);
                                return;
                            }
                            return;
                        default:
                            return;
                    }
                }
                return;
            case 1:
                AbstractC3557B.c0("intent", intent);
                if (intent.getAction() != null) {
                    s d10 = s.d();
                    String str = c.f16113a;
                    d10.a(str, "Received " + intent.getAction());
                    String action2 = intent.getAction();
                    if (action2 != null) {
                        int hashCode = action2.hashCode();
                        if (hashCode != -1980154005) {
                            if (hashCode == 490310653 && action2.equals("android.intent.action.BATTERY_LOW")) {
                                b(Boolean.FALSE);
                                return;
                            }
                            return;
                        } else if (action2.equals("android.intent.action.BATTERY_OKAY")) {
                            b(Boolean.TRUE);
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                }
                return;
            default:
                AbstractC3557B.c0("intent", intent);
                if (intent.getAction() != null) {
                    s d11 = s.d();
                    String str2 = l.f16128a;
                    d11.a(str2, "Received " + intent.getAction());
                    String action3 = intent.getAction();
                    if (action3 != null) {
                        int hashCode2 = action3.hashCode();
                        if (hashCode2 != -1181163412) {
                            if (hashCode2 == -730838620 && action3.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                                b(Boolean.TRUE);
                                return;
                            }
                            return;
                        } else if (action3.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                            b(Boolean.FALSE);
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                }
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
        if (r0.equals("android.intent.action.DEVICE_STORAGE_OK") == false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Boolean g() {
        int i10 = this.f16111g;
        boolean z10 = false;
        Context context = this.f16117b;
        switch (i10) {
            case 0:
                Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                if (registerReceiver == null) {
                    s.d().b(b.f16112a, "getInitialState - null intent received");
                    return Boolean.FALSE;
                }
                int intExtra = registerReceiver.getIntExtra("status", -1);
                if (intExtra == 2 || intExtra == 5) {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            case 1:
                Intent registerReceiver2 = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                if (registerReceiver2 == null) {
                    s.d().b(c.f16113a, "getInitialState - null intent received");
                    return Boolean.FALSE;
                }
                float intExtra2 = registerReceiver2.getIntExtra("level", -1) / registerReceiver2.getIntExtra("scale", -1);
                if (registerReceiver2.getIntExtra("status", -1) == 1 || intExtra2 > 0.15f) {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            default:
                Intent registerReceiver3 = context.registerReceiver(null, e());
                if (registerReceiver3 != null && registerReceiver3.getAction() != null) {
                    String action = registerReceiver3.getAction();
                    if (action != null) {
                        int hashCode = action.hashCode();
                        if (hashCode != -1181163412) {
                            if (hashCode == -730838620) {
                                break;
                            }
                        } else {
                            action.equals("android.intent.action.DEVICE_STORAGE_LOW");
                        }
                    }
                    return Boolean.valueOf(z10);
                }
                z10 = true;
                return Boolean.valueOf(z10);
        }
    }
}
