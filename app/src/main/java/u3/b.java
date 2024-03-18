package U3;

import L3.C0891c;
import L3.C0892d;
import android.os.Build;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import id.AbstractC3557B;
import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.util.Set;
import x3.y;
import z.AbstractC6708l;

/* loaded from: classes.dex */
public final class b extends x3.g {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f17393d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Object f17394e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Object obj, y yVar, int i10) {
        super(yVar);
        this.f17393d = i10;
        this.f17394e = obj;
        AbstractC3557B.c0("database", yVar);
    }

    @Override // p.AbstractC5028d
    public final String e() {
        switch (this.f17393d) {
            case 0:
                return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
            case 1:
                return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
            case 2:
                return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
            case 3:
                return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
            case 4:
                return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
            case 5:
                return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            default:
                return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }
    }

    @Override // x3.g
    public final void h(B3.i iVar, Object obj) {
        g gVar;
        int i10;
        int i11;
        byte[] bArr;
        int i12 = 3;
        switch (this.f17393d) {
            case 0:
                a aVar = (a) obj;
                String str = aVar.f17391a;
                if (str == null) {
                    iVar.s0(1);
                } else {
                    iVar.b(1, str);
                }
                String str2 = aVar.f17392b;
                if (str2 == null) {
                    iVar.s0(2);
                    return;
                } else {
                    iVar.b(2, str2);
                    return;
                }
            case 1:
                d dVar = (d) obj;
                String str3 = dVar.f17398a;
                if (str3 == null) {
                    iVar.s0(1);
                } else {
                    iVar.b(1, str3);
                }
                Long l10 = dVar.f17399b;
                if (l10 == null) {
                    iVar.s0(2);
                    return;
                } else {
                    iVar.T(2, l10.longValue());
                    return;
                }
            case 2:
                String str4 = ((g) obj).f17408a;
                if (str4 == null) {
                    iVar.s0(1);
                } else {
                    iVar.b(1, str4);
                }
                iVar.T(2, gVar.f17409b);
                iVar.T(3, gVar.f17410c);
                return;
            case 3:
                k kVar = (k) obj;
                String str5 = kVar.f17420a;
                if (str5 == null) {
                    iVar.s0(1);
                } else {
                    iVar.b(1, str5);
                }
                String str6 = kVar.f17421b;
                if (str6 == null) {
                    iVar.s0(2);
                    return;
                } else {
                    iVar.b(2, str6);
                    return;
                }
            case 4:
                android.gov.nist.core.a.u(obj);
                throw null;
            case 5:
                q qVar = (q) obj;
                String str7 = qVar.f17450a;
                if (str7 == null) {
                    iVar.s0(1);
                } else {
                    iVar.b(1, str7);
                }
                iVar.T(2, A7.b.H1(qVar.f17451b));
                String str8 = qVar.f17452c;
                if (str8 == null) {
                    iVar.s0(3);
                } else {
                    iVar.b(3, str8);
                }
                String str9 = qVar.f17453d;
                if (str9 == null) {
                    iVar.s0(4);
                } else {
                    iVar.b(4, str9);
                }
                byte[] b10 = L3.g.b(qVar.f17454e);
                if (b10 == null) {
                    iVar.s0(5);
                } else {
                    iVar.b0(5, b10);
                }
                byte[] b11 = L3.g.b(qVar.f17455f);
                if (b11 == null) {
                    iVar.s0(6);
                } else {
                    iVar.b0(6, b11);
                }
                iVar.T(7, qVar.f17456g);
                iVar.T(8, qVar.f17457h);
                iVar.T(9, qVar.f17458i);
                iVar.T(10, qVar.f17460k);
                int i13 = qVar.f17461l;
                AbstractC2469q0.q("backoffPolicy", i13);
                int f6 = AbstractC6708l.f(i13);
                if (f6 != 0) {
                    if (f6 == 1) {
                        i10 = 1;
                    } else {
                        throw new RuntimeException();
                    }
                } else {
                    i10 = 0;
                }
                iVar.T(11, i10);
                iVar.T(12, qVar.f17462m);
                iVar.T(13, qVar.f17463n);
                iVar.T(14, qVar.f17464o);
                iVar.T(15, qVar.f17465p);
                iVar.T(16, qVar.f17466q ? 1L : 0L);
                int i14 = qVar.f17467r;
                AbstractC2469q0.q("policy", i14);
                int f10 = AbstractC6708l.f(i14);
                if (f10 != 0) {
                    if (f10 == 1) {
                        i11 = 1;
                    } else {
                        throw new RuntimeException();
                    }
                } else {
                    i11 = 0;
                }
                iVar.T(17, i11);
                iVar.T(18, qVar.f17468s);
                iVar.T(19, qVar.f17469t);
                iVar.T(20, qVar.f17470u);
                iVar.T(21, qVar.f17471v);
                iVar.T(22, qVar.f17472w);
                C0892d c0892d = qVar.f17459j;
                if (c0892d != null) {
                    int i15 = c0892d.f10699a;
                    AbstractC2469q0.q("networkType", i15);
                    int f11 = AbstractC6708l.f(i15);
                    if (f11 != 0) {
                        if (f11 != 1) {
                            if (f11 != 2) {
                                if (f11 != 3) {
                                    if (f11 != 4) {
                                        if (Build.VERSION.SDK_INT >= 30 && i15 == 6) {
                                            i12 = 5;
                                        } else {
                                            throw new IllegalArgumentException("Could not convert " + E9.f.Q(i15) + " to int");
                                        }
                                    } else {
                                        i12 = 4;
                                    }
                                }
                            } else {
                                i12 = 2;
                            }
                        } else {
                            i12 = 1;
                        }
                    } else {
                        i12 = 0;
                    }
                    iVar.T(23, i12);
                    iVar.T(24, c0892d.f10700b ? 1L : 0L);
                    iVar.T(25, c0892d.f10701c ? 1L : 0L);
                    iVar.T(26, c0892d.f10702d ? 1L : 0L);
                    iVar.T(27, c0892d.f10703e ? 1L : 0L);
                    iVar.T(28, c0892d.f10704f);
                    iVar.T(29, c0892d.f10705g);
                    Set<C0891c> set = c0892d.f10706h;
                    AbstractC3557B.c0("triggers", set);
                    if (set.isEmpty()) {
                        bArr = new byte[0];
                    } else {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        try {
                            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                            objectOutputStream.writeInt(set.size());
                            for (C0891c c0891c : set) {
                                objectOutputStream.writeUTF(c0891c.f10696a.toString());
                                objectOutputStream.writeBoolean(c0891c.f10697b);
                            }
                            Ad.l.S(byteArrayOutputStream, null);
                            bArr = byteArrayOutputStream.toByteArray();
                            AbstractC3557B.b0("outputStream.toByteArray()", bArr);
                        } catch (Throwable th2) {
                            try {
                                throw th2;
                            } finally {
                                Ad.l.S(byteArrayOutputStream, th2);
                            }
                        }
                    }
                    iVar.b0(30, bArr);
                    return;
                }
                iVar.s0(23);
                iVar.s0(24);
                iVar.s0(25);
                iVar.s0(26);
                iVar.s0(27);
                iVar.s0(28);
                iVar.s0(29);
                iVar.s0(30);
                return;
            default:
                t tVar = (t) obj;
                String str10 = tVar.f17488a;
                if (str10 == null) {
                    iVar.s0(1);
                } else {
                    iVar.b(1, str10);
                }
                String str11 = tVar.f17489b;
                if (str11 == null) {
                    iVar.s0(2);
                    return;
                } else {
                    iVar.b(2, str11);
                    return;
                }
        }
    }
}
