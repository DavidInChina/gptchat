package d5;

import M3.H;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.Signature;
import android.gov.nist.core.Separators;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.hardware.biometrics.BiometricManager;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.os.BatteryManager;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.view.InputDevice;
import android.view.WindowManager;
import f5.C2937a;
import h.C3276b;
import io.sentry.android.core.AbstractC3612c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import nf.AbstractC4828h;

/* loaded from: classes2.dex */
public final class b extends AbstractC4828h implements g {

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ int f27995p;

    /* renamed from: q  reason: collision with root package name */
    public final Context f27996q;

    public /* synthetic */ b(Context context, int i10) {
        this.f27995p = i10;
        this.f27996q = context;
    }

    @Override // d5.g
    public final ArrayList a() {
        String str;
        String str2;
        String str3;
        switch (this.f27995p) {
            case 0:
                ArrayList arrayList = new ArrayList();
                C2937a.d("AppInformation", "Collecting signals", new Throwable[0]);
                AbstractC4828h.n(arrayList, "mobile_sdk__app_id", new c(this) { // from class: d5.a

                    /* renamed from: Z  reason: collision with root package name */
                    public final /* synthetic */ b f27994Z;

                    {
                        this.f27994Z = this;
                    }

                    @Override // d5.c
                    public final Object a() {
                        int i10 = r2;
                        b bVar = this.f27994Z;
                        switch (i10) {
                            case 0:
                                return bVar.w0();
                            case 1:
                                Context context = bVar.f27996q;
                                return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
                            default:
                                return bVar.x0();
                        }
                    }
                });
                AbstractC4828h.n(arrayList, "mobile_sdk__app_version", new c(this) { // from class: d5.a

                    /* renamed from: Z  reason: collision with root package name */
                    public final /* synthetic */ b f27994Z;

                    {
                        this.f27994Z = this;
                    }

                    @Override // d5.c
                    public final Object a() {
                        int i10 = r2;
                        b bVar = this.f27994Z;
                        switch (i10) {
                            case 0:
                                return bVar.w0();
                            case 1:
                                Context context = bVar.f27996q;
                                return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
                            default:
                                return bVar.x0();
                        }
                    }
                });
                AbstractC4828h.n(arrayList, "mobile_sdk__app_signing_credential", new c(this) { // from class: d5.a

                    /* renamed from: Z  reason: collision with root package name */
                    public final /* synthetic */ b f27994Z;

                    {
                        this.f27994Z = this;
                    }

                    @Override // d5.c
                    public final Object a() {
                        int i10 = r2;
                        b bVar = this.f27994Z;
                        switch (i10) {
                            case 0:
                                return bVar.w0();
                            case 1:
                                Context context = bVar.f27996q;
                                return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
                            default:
                                return bVar.x0();
                        }
                    }
                });
                return arrayList;
            case 1:
                ArrayList arrayList2 = new ArrayList();
                C2937a.d("DeviceState", "Collecting signals", new Throwable[0]);
                AbstractC4828h.n(arrayList2, "mobile_sdk__device_orientation", new C3276b(20, this));
                return arrayList2;
            case 2:
                ArrayList arrayList3 = new ArrayList();
                C2937a.d("HardwareInformation", "Collecting signals", new Throwable[0]);
                arrayList3.add(new f("mobile_sdk__board", Build.BOARD));
                AbstractC4828h.n(arrayList3, "mobile_sdk__cpu_abi", new c(this) { // from class: d5.d

                    /* renamed from: Z  reason: collision with root package name */
                    public final /* synthetic */ b f27998Z;

                    {
                        this.f27998Z = this;
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:83:0x0253, code lost:
                        if (r2 != 1) goto L84;
                     */
                    /* JADX WARN: Removed duplicated region for block: B:76:0x0246  */
                    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, androidx.appcompat.view.a] */
                    @Override // d5.c
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object a() {
                        int i10;
                        int i11 = 2;
                        int i12 = r2;
                        int i13 = 0;
                        b bVar = this.f27998Z;
                        switch (i12) {
                            case 0:
                                bVar.getClass();
                                return new ArrayList(Arrays.asList(Build.SUPPORTED_ABIS));
                            case 1:
                                ?? obj = new Object();
                                Context applicationContext = bVar.f27996q.getApplicationContext();
                                obj.f24351a = applicationContext;
                                t.c cVar = new t.c(obj);
                                int i14 = Build.VERSION.SDK_INT;
                                BiometricManager biometricManager = cVar.f45603a;
                                if (i14 >= 30) {
                                    if (biometricManager == null) {
                                        AbstractC3612c.c("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
                                        i10 = 1;
                                        if (i10 != 11) {
                                            if (i10 != 12 && i10 != 15 && i10 != -2) {
                                                if (i10 != -1) {
                                                    if (i10 == 0) {
                                                        i11 = 3;
                                                    }
                                                }
                                                i11 = 0;
                                            }
                                            i11 = 1;
                                        }
                                        return Integer.valueOf(i11);
                                    }
                                    i10 = t.b.a(biometricManager, 255);
                                    if (i10 != 11) {
                                    }
                                    return Integer.valueOf(i11);
                                }
                                if (t.d.a(applicationContext) != null) {
                                    if (i14 == 29) {
                                        if (biometricManager == null) {
                                            AbstractC3612c.c("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
                                            i10 = 1;
                                        } else {
                                            i10 = t.a.a(biometricManager);
                                        }
                                    } else if (i14 == 28) {
                                        if (applicationContext != null && applicationContext.getPackageManager() != null && t.e.a(applicationContext.getPackageManager())) {
                                            KeyguardManager a5 = t.d.a(obj.f24351a);
                                            if (a5 == null || !t.d.b(a5)) {
                                                i10 = cVar.a();
                                            } else if (cVar.a() == 0) {
                                                i10 = 0;
                                            } else {
                                                i10 = -1;
                                            }
                                        }
                                    } else {
                                        i10 = cVar.a();
                                    }
                                    if (i10 != 11) {
                                    }
                                    return Integer.valueOf(i11);
                                }
                                i10 = 12;
                                if (i10 != 11) {
                                }
                                return Integer.valueOf(i11);
                            case 2:
                                switch (bVar.f27995p) {
                                    case 2:
                                        return System.getProperty("os.arch", "");
                                    default:
                                        return AbstractC4828h.m(Arrays.asList(bVar.f27996q.getAssets().getLocales()).toString());
                                }
                            case 3:
                                bVar.getClass();
                                return Integer.valueOf(Runtime.getRuntime().availableProcessors());
                            case 4:
                                bVar.getClass();
                                return H.f11528b.getString("gpuInfo", "");
                            case 5:
                                bVar.getClass();
                                ArrayList arrayList4 = new ArrayList();
                                StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
                                long blockSizeLong = statFs.getBlockSizeLong();
                                long blockCountLong = statFs.getBlockCountLong() * blockSizeLong;
                                arrayList4.add(Long.valueOf(statFs.getAvailableBlocksLong() * blockSizeLong));
                                arrayList4.add(Long.valueOf(blockCountLong));
                                if (Environment.isExternalStorageRemovable()) {
                                    StatFs statFs2 = new StatFs(Environment.getExternalStorageDirectory().getPath());
                                    long blockSizeLong2 = statFs2.getBlockSizeLong();
                                    long blockCountLong2 = statFs2.getBlockCountLong() * blockSizeLong2;
                                    arrayList4.add(Long.valueOf(statFs2.getAvailableBlocksLong() * blockSizeLong2));
                                    arrayList4.add(Long.valueOf(blockCountLong2));
                                }
                                return arrayList4;
                            case 6:
                                bVar.getClass();
                                StringBuilder sb2 = new StringBuilder();
                                int[] deviceIds = InputDevice.getDeviceIds();
                                if (deviceIds.length <= 0) {
                                    return "";
                                }
                                int length = deviceIds.length;
                                while (i13 < length) {
                                    InputDevice device = InputDevice.getDevice(deviceIds[i13]);
                                    sb2.append(device.getName() + Separators.COMMA + device.getVendorId() + Separators.SEMICOLON);
                                    i13++;
                                }
                                String str4 = deviceIds.length + Separators.POUND + sb2.toString();
                                return AbstractC4828h.m(str4.substring(str4.indexOf(Separators.POUND) + 1));
                            case 7:
                                StringBuilder sb3 = new StringBuilder();
                                List<Sensor> sensorList = ((SensorManager) bVar.f27996q.getSystemService("sensor")).getSensorList(-1);
                                if (sensorList.size() > 0) {
                                    while (i13 < sensorList.size()) {
                                        sb3.append(sensorList.get(i13).getName() + Separators.COMMA + sensorList.get(i13).getVendor() + Separators.SEMICOLON);
                                        i13++;
                                    }
                                    return AbstractC4828h.m(sb3.toString());
                                }
                                return null;
                            default:
                                CameraManager cameraManager = (CameraManager) bVar.f27996q.getSystemService("camera");
                                int i15 = 0;
                                int i16 = 0;
                                int i17 = 0;
                                for (String str5 : cameraManager.getCameraIdList()) {
                                    CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str5);
                                    CameraCharacteristics.Key key = CameraCharacteristics.LENS_FACING;
                                    if (((Integer) cameraCharacteristics.get(key)).intValue() == 0) {
                                        i17++;
                                    } else if (((Integer) cameraCharacteristics.get(key)).intValue() == 1) {
                                        i16++;
                                    } else {
                                        i15++;
                                    }
                                }
                                return new ArrayList(Arrays.asList(Integer.valueOf(i17), Integer.valueOf(i16), Integer.valueOf(i15)));
                        }
                    }
                });
                arrayList3.add(new f("mobile_sdk__hardware", Build.HARDWARE));
                if (Build.VERSION.SDK_INT >= 31) {
                    str2 = Build.SOC_MANUFACTURER;
                    arrayList3.add(new f("mobile_sdk__soc_manufacturer", str2));
                    str3 = Build.SOC_MODEL;
                    arrayList3.add(new f("mobile_sdk__soc_model", str3));
                }
                AbstractC4828h.n(arrayList3, "mobile_sdk__device_arch", new c(this) { // from class: d5.d

                    /* renamed from: Z  reason: collision with root package name */
                    public final /* synthetic */ b f27998Z;

                    {
                        this.f27998Z = this;
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:83:0x0253, code lost:
                        if (r2 != 1) goto L84;
                     */
                    /* JADX WARN: Removed duplicated region for block: B:76:0x0246  */
                    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, androidx.appcompat.view.a] */
                    @Override // d5.c
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object a() {
                        int i10;
                        int i11 = 2;
                        int i12 = r2;
                        int i13 = 0;
                        b bVar = this.f27998Z;
                        switch (i12) {
                            case 0:
                                bVar.getClass();
                                return new ArrayList(Arrays.asList(Build.SUPPORTED_ABIS));
                            case 1:
                                ?? obj = new Object();
                                Context applicationContext = bVar.f27996q.getApplicationContext();
                                obj.f24351a = applicationContext;
                                t.c cVar = new t.c(obj);
                                int i14 = Build.VERSION.SDK_INT;
                                BiometricManager biometricManager = cVar.f45603a;
                                if (i14 >= 30) {
                                    if (biometricManager == null) {
                                        AbstractC3612c.c("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
                                        i10 = 1;
                                        if (i10 != 11) {
                                            if (i10 != 12 && i10 != 15 && i10 != -2) {
                                                if (i10 != -1) {
                                                    if (i10 == 0) {
                                                        i11 = 3;
                                                    }
                                                }
                                                i11 = 0;
                                            }
                                            i11 = 1;
                                        }
                                        return Integer.valueOf(i11);
                                    }
                                    i10 = t.b.a(biometricManager, 255);
                                    if (i10 != 11) {
                                    }
                                    return Integer.valueOf(i11);
                                }
                                if (t.d.a(applicationContext) != null) {
                                    if (i14 == 29) {
                                        if (biometricManager == null) {
                                            AbstractC3612c.c("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
                                            i10 = 1;
                                        } else {
                                            i10 = t.a.a(biometricManager);
                                        }
                                    } else if (i14 == 28) {
                                        if (applicationContext != null && applicationContext.getPackageManager() != null && t.e.a(applicationContext.getPackageManager())) {
                                            KeyguardManager a5 = t.d.a(obj.f24351a);
                                            if (a5 == null || !t.d.b(a5)) {
                                                i10 = cVar.a();
                                            } else if (cVar.a() == 0) {
                                                i10 = 0;
                                            } else {
                                                i10 = -1;
                                            }
                                        }
                                    } else {
                                        i10 = cVar.a();
                                    }
                                    if (i10 != 11) {
                                    }
                                    return Integer.valueOf(i11);
                                }
                                i10 = 12;
                                if (i10 != 11) {
                                }
                                return Integer.valueOf(i11);
                            case 2:
                                switch (bVar.f27995p) {
                                    case 2:
                                        return System.getProperty("os.arch", "");
                                    default:
                                        return AbstractC4828h.m(Arrays.asList(bVar.f27996q.getAssets().getLocales()).toString());
                                }
                            case 3:
                                bVar.getClass();
                                return Integer.valueOf(Runtime.getRuntime().availableProcessors());
                            case 4:
                                bVar.getClass();
                                return H.f11528b.getString("gpuInfo", "");
                            case 5:
                                bVar.getClass();
                                ArrayList arrayList4 = new ArrayList();
                                StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
                                long blockSizeLong = statFs.getBlockSizeLong();
                                long blockCountLong = statFs.getBlockCountLong() * blockSizeLong;
                                arrayList4.add(Long.valueOf(statFs.getAvailableBlocksLong() * blockSizeLong));
                                arrayList4.add(Long.valueOf(blockCountLong));
                                if (Environment.isExternalStorageRemovable()) {
                                    StatFs statFs2 = new StatFs(Environment.getExternalStorageDirectory().getPath());
                                    long blockSizeLong2 = statFs2.getBlockSizeLong();
                                    long blockCountLong2 = statFs2.getBlockCountLong() * blockSizeLong2;
                                    arrayList4.add(Long.valueOf(statFs2.getAvailableBlocksLong() * blockSizeLong2));
                                    arrayList4.add(Long.valueOf(blockCountLong2));
                                }
                                return arrayList4;
                            case 6:
                                bVar.getClass();
                                StringBuilder sb2 = new StringBuilder();
                                int[] deviceIds = InputDevice.getDeviceIds();
                                if (deviceIds.length <= 0) {
                                    return "";
                                }
                                int length = deviceIds.length;
                                while (i13 < length) {
                                    InputDevice device = InputDevice.getDevice(deviceIds[i13]);
                                    sb2.append(device.getName() + Separators.COMMA + device.getVendorId() + Separators.SEMICOLON);
                                    i13++;
                                }
                                String str4 = deviceIds.length + Separators.POUND + sb2.toString();
                                return AbstractC4828h.m(str4.substring(str4.indexOf(Separators.POUND) + 1));
                            case 7:
                                StringBuilder sb3 = new StringBuilder();
                                List<Sensor> sensorList = ((SensorManager) bVar.f27996q.getSystemService("sensor")).getSensorList(-1);
                                if (sensorList.size() > 0) {
                                    while (i13 < sensorList.size()) {
                                        sb3.append(sensorList.get(i13).getName() + Separators.COMMA + sensorList.get(i13).getVendor() + Separators.SEMICOLON);
                                        i13++;
                                    }
                                    return AbstractC4828h.m(sb3.toString());
                                }
                                return null;
                            default:
                                CameraManager cameraManager = (CameraManager) bVar.f27996q.getSystemService("camera");
                                int i15 = 0;
                                int i16 = 0;
                                int i17 = 0;
                                for (String str5 : cameraManager.getCameraIdList()) {
                                    CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str5);
                                    CameraCharacteristics.Key key = CameraCharacteristics.LENS_FACING;
                                    if (((Integer) cameraCharacteristics.get(key)).intValue() == 0) {
                                        i17++;
                                    } else if (((Integer) cameraCharacteristics.get(key)).intValue() == 1) {
                                        i16++;
                                    } else {
                                        i15++;
                                    }
                                }
                                return new ArrayList(Arrays.asList(Integer.valueOf(i17), Integer.valueOf(i16), Integer.valueOf(i15)));
                        }
                    }
                });
                AbstractC4828h.n(arrayList3, "mobile_sdk__cpu_cores", new c(this) { // from class: d5.d

                    /* renamed from: Z  reason: collision with root package name */
                    public final /* synthetic */ b f27998Z;

                    {
                        this.f27998Z = this;
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:83:0x0253, code lost:
                        if (r2 != 1) goto L84;
                     */
                    /* JADX WARN: Removed duplicated region for block: B:76:0x0246  */
                    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, androidx.appcompat.view.a] */
                    @Override // d5.c
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object a() {
                        int i10;
                        int i11 = 2;
                        int i12 = r2;
                        int i13 = 0;
                        b bVar = this.f27998Z;
                        switch (i12) {
                            case 0:
                                bVar.getClass();
                                return new ArrayList(Arrays.asList(Build.SUPPORTED_ABIS));
                            case 1:
                                ?? obj = new Object();
                                Context applicationContext = bVar.f27996q.getApplicationContext();
                                obj.f24351a = applicationContext;
                                t.c cVar = new t.c(obj);
                                int i14 = Build.VERSION.SDK_INT;
                                BiometricManager biometricManager = cVar.f45603a;
                                if (i14 >= 30) {
                                    if (biometricManager == null) {
                                        AbstractC3612c.c("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
                                        i10 = 1;
                                        if (i10 != 11) {
                                            if (i10 != 12 && i10 != 15 && i10 != -2) {
                                                if (i10 != -1) {
                                                    if (i10 == 0) {
                                                        i11 = 3;
                                                    }
                                                }
                                                i11 = 0;
                                            }
                                            i11 = 1;
                                        }
                                        return Integer.valueOf(i11);
                                    }
                                    i10 = t.b.a(biometricManager, 255);
                                    if (i10 != 11) {
                                    }
                                    return Integer.valueOf(i11);
                                }
                                if (t.d.a(applicationContext) != null) {
                                    if (i14 == 29) {
                                        if (biometricManager == null) {
                                            AbstractC3612c.c("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
                                            i10 = 1;
                                        } else {
                                            i10 = t.a.a(biometricManager);
                                        }
                                    } else if (i14 == 28) {
                                        if (applicationContext != null && applicationContext.getPackageManager() != null && t.e.a(applicationContext.getPackageManager())) {
                                            KeyguardManager a5 = t.d.a(obj.f24351a);
                                            if (a5 == null || !t.d.b(a5)) {
                                                i10 = cVar.a();
                                            } else if (cVar.a() == 0) {
                                                i10 = 0;
                                            } else {
                                                i10 = -1;
                                            }
                                        }
                                    } else {
                                        i10 = cVar.a();
                                    }
                                    if (i10 != 11) {
                                    }
                                    return Integer.valueOf(i11);
                                }
                                i10 = 12;
                                if (i10 != 11) {
                                }
                                return Integer.valueOf(i11);
                            case 2:
                                switch (bVar.f27995p) {
                                    case 2:
                                        return System.getProperty("os.arch", "");
                                    default:
                                        return AbstractC4828h.m(Arrays.asList(bVar.f27996q.getAssets().getLocales()).toString());
                                }
                            case 3:
                                bVar.getClass();
                                return Integer.valueOf(Runtime.getRuntime().availableProcessors());
                            case 4:
                                bVar.getClass();
                                return H.f11528b.getString("gpuInfo", "");
                            case 5:
                                bVar.getClass();
                                ArrayList arrayList4 = new ArrayList();
                                StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
                                long blockSizeLong = statFs.getBlockSizeLong();
                                long blockCountLong = statFs.getBlockCountLong() * blockSizeLong;
                                arrayList4.add(Long.valueOf(statFs.getAvailableBlocksLong() * blockSizeLong));
                                arrayList4.add(Long.valueOf(blockCountLong));
                                if (Environment.isExternalStorageRemovable()) {
                                    StatFs statFs2 = new StatFs(Environment.getExternalStorageDirectory().getPath());
                                    long blockSizeLong2 = statFs2.getBlockSizeLong();
                                    long blockCountLong2 = statFs2.getBlockCountLong() * blockSizeLong2;
                                    arrayList4.add(Long.valueOf(statFs2.getAvailableBlocksLong() * blockSizeLong2));
                                    arrayList4.add(Long.valueOf(blockCountLong2));
                                }
                                return arrayList4;
                            case 6:
                                bVar.getClass();
                                StringBuilder sb2 = new StringBuilder();
                                int[] deviceIds = InputDevice.getDeviceIds();
                                if (deviceIds.length <= 0) {
                                    return "";
                                }
                                int length = deviceIds.length;
                                while (i13 < length) {
                                    InputDevice device = InputDevice.getDevice(deviceIds[i13]);
                                    sb2.append(device.getName() + Separators.COMMA + device.getVendorId() + Separators.SEMICOLON);
                                    i13++;
                                }
                                String str4 = deviceIds.length + Separators.POUND + sb2.toString();
                                return AbstractC4828h.m(str4.substring(str4.indexOf(Separators.POUND) + 1));
                            case 7:
                                StringBuilder sb3 = new StringBuilder();
                                List<Sensor> sensorList = ((SensorManager) bVar.f27996q.getSystemService("sensor")).getSensorList(-1);
                                if (sensorList.size() > 0) {
                                    while (i13 < sensorList.size()) {
                                        sb3.append(sensorList.get(i13).getName() + Separators.COMMA + sensorList.get(i13).getVendor() + Separators.SEMICOLON);
                                        i13++;
                                    }
                                    return AbstractC4828h.m(sb3.toString());
                                }
                                return null;
                            default:
                                CameraManager cameraManager = (CameraManager) bVar.f27996q.getSystemService("camera");
                                int i15 = 0;
                                int i16 = 0;
                                int i17 = 0;
                                for (String str5 : cameraManager.getCameraIdList()) {
                                    CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str5);
                                    CameraCharacteristics.Key key = CameraCharacteristics.LENS_FACING;
                                    if (((Integer) cameraCharacteristics.get(key)).intValue() == 0) {
                                        i17++;
                                    } else if (((Integer) cameraCharacteristics.get(key)).intValue() == 1) {
                                        i16++;
                                    } else {
                                        i15++;
                                    }
                                }
                                return new ArrayList(Arrays.asList(Integer.valueOf(i17), Integer.valueOf(i16), Integer.valueOf(i15)));
                        }
                    }
                });
                AbstractC4828h.n(arrayList3, "mobile_sdk__gpu", new c(this) { // from class: d5.d

                    /* renamed from: Z  reason: collision with root package name */
                    public final /* synthetic */ b f27998Z;

                    {
                        this.f27998Z = this;
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:83:0x0253, code lost:
                        if (r2 != 1) goto L84;
                     */
                    /* JADX WARN: Removed duplicated region for block: B:76:0x0246  */
                    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, androidx.appcompat.view.a] */
                    @Override // d5.c
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object a() {
                        int i10;
                        int i11 = 2;
                        int i12 = r2;
                        int i13 = 0;
                        b bVar = this.f27998Z;
                        switch (i12) {
                            case 0:
                                bVar.getClass();
                                return new ArrayList(Arrays.asList(Build.SUPPORTED_ABIS));
                            case 1:
                                ?? obj = new Object();
                                Context applicationContext = bVar.f27996q.getApplicationContext();
                                obj.f24351a = applicationContext;
                                t.c cVar = new t.c(obj);
                                int i14 = Build.VERSION.SDK_INT;
                                BiometricManager biometricManager = cVar.f45603a;
                                if (i14 >= 30) {
                                    if (biometricManager == null) {
                                        AbstractC3612c.c("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
                                        i10 = 1;
                                        if (i10 != 11) {
                                            if (i10 != 12 && i10 != 15 && i10 != -2) {
                                                if (i10 != -1) {
                                                    if (i10 == 0) {
                                                        i11 = 3;
                                                    }
                                                }
                                                i11 = 0;
                                            }
                                            i11 = 1;
                                        }
                                        return Integer.valueOf(i11);
                                    }
                                    i10 = t.b.a(biometricManager, 255);
                                    if (i10 != 11) {
                                    }
                                    return Integer.valueOf(i11);
                                }
                                if (t.d.a(applicationContext) != null) {
                                    if (i14 == 29) {
                                        if (biometricManager == null) {
                                            AbstractC3612c.c("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
                                            i10 = 1;
                                        } else {
                                            i10 = t.a.a(biometricManager);
                                        }
                                    } else if (i14 == 28) {
                                        if (applicationContext != null && applicationContext.getPackageManager() != null && t.e.a(applicationContext.getPackageManager())) {
                                            KeyguardManager a5 = t.d.a(obj.f24351a);
                                            if (a5 == null || !t.d.b(a5)) {
                                                i10 = cVar.a();
                                            } else if (cVar.a() == 0) {
                                                i10 = 0;
                                            } else {
                                                i10 = -1;
                                            }
                                        }
                                    } else {
                                        i10 = cVar.a();
                                    }
                                    if (i10 != 11) {
                                    }
                                    return Integer.valueOf(i11);
                                }
                                i10 = 12;
                                if (i10 != 11) {
                                }
                                return Integer.valueOf(i11);
                            case 2:
                                switch (bVar.f27995p) {
                                    case 2:
                                        return System.getProperty("os.arch", "");
                                    default:
                                        return AbstractC4828h.m(Arrays.asList(bVar.f27996q.getAssets().getLocales()).toString());
                                }
                            case 3:
                                bVar.getClass();
                                return Integer.valueOf(Runtime.getRuntime().availableProcessors());
                            case 4:
                                bVar.getClass();
                                return H.f11528b.getString("gpuInfo", "");
                            case 5:
                                bVar.getClass();
                                ArrayList arrayList4 = new ArrayList();
                                StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
                                long blockSizeLong = statFs.getBlockSizeLong();
                                long blockCountLong = statFs.getBlockCountLong() * blockSizeLong;
                                arrayList4.add(Long.valueOf(statFs.getAvailableBlocksLong() * blockSizeLong));
                                arrayList4.add(Long.valueOf(blockCountLong));
                                if (Environment.isExternalStorageRemovable()) {
                                    StatFs statFs2 = new StatFs(Environment.getExternalStorageDirectory().getPath());
                                    long blockSizeLong2 = statFs2.getBlockSizeLong();
                                    long blockCountLong2 = statFs2.getBlockCountLong() * blockSizeLong2;
                                    arrayList4.add(Long.valueOf(statFs2.getAvailableBlocksLong() * blockSizeLong2));
                                    arrayList4.add(Long.valueOf(blockCountLong2));
                                }
                                return arrayList4;
                            case 6:
                                bVar.getClass();
                                StringBuilder sb2 = new StringBuilder();
                                int[] deviceIds = InputDevice.getDeviceIds();
                                if (deviceIds.length <= 0) {
                                    return "";
                                }
                                int length = deviceIds.length;
                                while (i13 < length) {
                                    InputDevice device = InputDevice.getDevice(deviceIds[i13]);
                                    sb2.append(device.getName() + Separators.COMMA + device.getVendorId() + Separators.SEMICOLON);
                                    i13++;
                                }
                                String str4 = deviceIds.length + Separators.POUND + sb2.toString();
                                return AbstractC4828h.m(str4.substring(str4.indexOf(Separators.POUND) + 1));
                            case 7:
                                StringBuilder sb3 = new StringBuilder();
                                List<Sensor> sensorList = ((SensorManager) bVar.f27996q.getSystemService("sensor")).getSensorList(-1);
                                if (sensorList.size() > 0) {
                                    while (i13 < sensorList.size()) {
                                        sb3.append(sensorList.get(i13).getName() + Separators.COMMA + sensorList.get(i13).getVendor() + Separators.SEMICOLON);
                                        i13++;
                                    }
                                    return AbstractC4828h.m(sb3.toString());
                                }
                                return null;
                            default:
                                CameraManager cameraManager = (CameraManager) bVar.f27996q.getSystemService("camera");
                                int i15 = 0;
                                int i16 = 0;
                                int i17 = 0;
                                for (String str5 : cameraManager.getCameraIdList()) {
                                    CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str5);
                                    CameraCharacteristics.Key key = CameraCharacteristics.LENS_FACING;
                                    if (((Integer) cameraCharacteristics.get(key)).intValue() == 0) {
                                        i17++;
                                    } else if (((Integer) cameraCharacteristics.get(key)).intValue() == 1) {
                                        i16++;
                                    } else {
                                        i15++;
                                    }
                                }
                                return new ArrayList(Arrays.asList(Integer.valueOf(i17), Integer.valueOf(i16), Integer.valueOf(i15)));
                        }
                    }
                });
                AbstractC4828h.n(arrayList3, "mobile_sdk__storage_info", new c(this) { // from class: d5.d

                    /* renamed from: Z  reason: collision with root package name */
                    public final /* synthetic */ b f27998Z;

                    {
                        this.f27998Z = this;
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:83:0x0253, code lost:
                        if (r2 != 1) goto L84;
                     */
                    /* JADX WARN: Removed duplicated region for block: B:76:0x0246  */
                    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, androidx.appcompat.view.a] */
                    @Override // d5.c
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object a() {
                        int i10;
                        int i11 = 2;
                        int i12 = r2;
                        int i13 = 0;
                        b bVar = this.f27998Z;
                        switch (i12) {
                            case 0:
                                bVar.getClass();
                                return new ArrayList(Arrays.asList(Build.SUPPORTED_ABIS));
                            case 1:
                                ?? obj = new Object();
                                Context applicationContext = bVar.f27996q.getApplicationContext();
                                obj.f24351a = applicationContext;
                                t.c cVar = new t.c(obj);
                                int i14 = Build.VERSION.SDK_INT;
                                BiometricManager biometricManager = cVar.f45603a;
                                if (i14 >= 30) {
                                    if (biometricManager == null) {
                                        AbstractC3612c.c("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
                                        i10 = 1;
                                        if (i10 != 11) {
                                            if (i10 != 12 && i10 != 15 && i10 != -2) {
                                                if (i10 != -1) {
                                                    if (i10 == 0) {
                                                        i11 = 3;
                                                    }
                                                }
                                                i11 = 0;
                                            }
                                            i11 = 1;
                                        }
                                        return Integer.valueOf(i11);
                                    }
                                    i10 = t.b.a(biometricManager, 255);
                                    if (i10 != 11) {
                                    }
                                    return Integer.valueOf(i11);
                                }
                                if (t.d.a(applicationContext) != null) {
                                    if (i14 == 29) {
                                        if (biometricManager == null) {
                                            AbstractC3612c.c("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
                                            i10 = 1;
                                        } else {
                                            i10 = t.a.a(biometricManager);
                                        }
                                    } else if (i14 == 28) {
                                        if (applicationContext != null && applicationContext.getPackageManager() != null && t.e.a(applicationContext.getPackageManager())) {
                                            KeyguardManager a5 = t.d.a(obj.f24351a);
                                            if (a5 == null || !t.d.b(a5)) {
                                                i10 = cVar.a();
                                            } else if (cVar.a() == 0) {
                                                i10 = 0;
                                            } else {
                                                i10 = -1;
                                            }
                                        }
                                    } else {
                                        i10 = cVar.a();
                                    }
                                    if (i10 != 11) {
                                    }
                                    return Integer.valueOf(i11);
                                }
                                i10 = 12;
                                if (i10 != 11) {
                                }
                                return Integer.valueOf(i11);
                            case 2:
                                switch (bVar.f27995p) {
                                    case 2:
                                        return System.getProperty("os.arch", "");
                                    default:
                                        return AbstractC4828h.m(Arrays.asList(bVar.f27996q.getAssets().getLocales()).toString());
                                }
                            case 3:
                                bVar.getClass();
                                return Integer.valueOf(Runtime.getRuntime().availableProcessors());
                            case 4:
                                bVar.getClass();
                                return H.f11528b.getString("gpuInfo", "");
                            case 5:
                                bVar.getClass();
                                ArrayList arrayList4 = new ArrayList();
                                StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
                                long blockSizeLong = statFs.getBlockSizeLong();
                                long blockCountLong = statFs.getBlockCountLong() * blockSizeLong;
                                arrayList4.add(Long.valueOf(statFs.getAvailableBlocksLong() * blockSizeLong));
                                arrayList4.add(Long.valueOf(blockCountLong));
                                if (Environment.isExternalStorageRemovable()) {
                                    StatFs statFs2 = new StatFs(Environment.getExternalStorageDirectory().getPath());
                                    long blockSizeLong2 = statFs2.getBlockSizeLong();
                                    long blockCountLong2 = statFs2.getBlockCountLong() * blockSizeLong2;
                                    arrayList4.add(Long.valueOf(statFs2.getAvailableBlocksLong() * blockSizeLong2));
                                    arrayList4.add(Long.valueOf(blockCountLong2));
                                }
                                return arrayList4;
                            case 6:
                                bVar.getClass();
                                StringBuilder sb2 = new StringBuilder();
                                int[] deviceIds = InputDevice.getDeviceIds();
                                if (deviceIds.length <= 0) {
                                    return "";
                                }
                                int length = deviceIds.length;
                                while (i13 < length) {
                                    InputDevice device = InputDevice.getDevice(deviceIds[i13]);
                                    sb2.append(device.getName() + Separators.COMMA + device.getVendorId() + Separators.SEMICOLON);
                                    i13++;
                                }
                                String str4 = deviceIds.length + Separators.POUND + sb2.toString();
                                return AbstractC4828h.m(str4.substring(str4.indexOf(Separators.POUND) + 1));
                            case 7:
                                StringBuilder sb3 = new StringBuilder();
                                List<Sensor> sensorList = ((SensorManager) bVar.f27996q.getSystemService("sensor")).getSensorList(-1);
                                if (sensorList.size() > 0) {
                                    while (i13 < sensorList.size()) {
                                        sb3.append(sensorList.get(i13).getName() + Separators.COMMA + sensorList.get(i13).getVendor() + Separators.SEMICOLON);
                                        i13++;
                                    }
                                    return AbstractC4828h.m(sb3.toString());
                                }
                                return null;
                            default:
                                CameraManager cameraManager = (CameraManager) bVar.f27996q.getSystemService("camera");
                                int i15 = 0;
                                int i16 = 0;
                                int i17 = 0;
                                for (String str5 : cameraManager.getCameraIdList()) {
                                    CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str5);
                                    CameraCharacteristics.Key key = CameraCharacteristics.LENS_FACING;
                                    if (((Integer) cameraCharacteristics.get(key)).intValue() == 0) {
                                        i17++;
                                    } else if (((Integer) cameraCharacteristics.get(key)).intValue() == 1) {
                                        i16++;
                                    } else {
                                        i15++;
                                    }
                                }
                                return new ArrayList(Arrays.asList(Integer.valueOf(i17), Integer.valueOf(i16), Integer.valueOf(i15)));
                        }
                    }
                });
                DisplayMetrics displayMetrics = new DisplayMetrics();
                Context context = this.f27996q;
                ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRealMetrics(displayMetrics);
                Pair pair = new Pair(Integer.valueOf(displayMetrics.widthPixels), Integer.valueOf(displayMetrics.heightPixels));
                arrayList3.add(new f("mobile_sdk__screen_width", (Integer) pair.first));
                arrayList3.add(new f("mobile_sdk__screen_height", (Integer) pair.second));
                AbstractC4828h.n(arrayList3, "mobile_sdk__input_devices_hash", new c(this) { // from class: d5.d

                    /* renamed from: Z  reason: collision with root package name */
                    public final /* synthetic */ b f27998Z;

                    {
                        this.f27998Z = this;
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:83:0x0253, code lost:
                        if (r2 != 1) goto L84;
                     */
                    /* JADX WARN: Removed duplicated region for block: B:76:0x0246  */
                    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, androidx.appcompat.view.a] */
                    @Override // d5.c
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object a() {
                        int i10;
                        int i11 = 2;
                        int i12 = r2;
                        int i13 = 0;
                        b bVar = this.f27998Z;
                        switch (i12) {
                            case 0:
                                bVar.getClass();
                                return new ArrayList(Arrays.asList(Build.SUPPORTED_ABIS));
                            case 1:
                                ?? obj = new Object();
                                Context applicationContext = bVar.f27996q.getApplicationContext();
                                obj.f24351a = applicationContext;
                                t.c cVar = new t.c(obj);
                                int i14 = Build.VERSION.SDK_INT;
                                BiometricManager biometricManager = cVar.f45603a;
                                if (i14 >= 30) {
                                    if (biometricManager == null) {
                                        AbstractC3612c.c("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
                                        i10 = 1;
                                        if (i10 != 11) {
                                            if (i10 != 12 && i10 != 15 && i10 != -2) {
                                                if (i10 != -1) {
                                                    if (i10 == 0) {
                                                        i11 = 3;
                                                    }
                                                }
                                                i11 = 0;
                                            }
                                            i11 = 1;
                                        }
                                        return Integer.valueOf(i11);
                                    }
                                    i10 = t.b.a(biometricManager, 255);
                                    if (i10 != 11) {
                                    }
                                    return Integer.valueOf(i11);
                                }
                                if (t.d.a(applicationContext) != null) {
                                    if (i14 == 29) {
                                        if (biometricManager == null) {
                                            AbstractC3612c.c("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
                                            i10 = 1;
                                        } else {
                                            i10 = t.a.a(biometricManager);
                                        }
                                    } else if (i14 == 28) {
                                        if (applicationContext != null && applicationContext.getPackageManager() != null && t.e.a(applicationContext.getPackageManager())) {
                                            KeyguardManager a5 = t.d.a(obj.f24351a);
                                            if (a5 == null || !t.d.b(a5)) {
                                                i10 = cVar.a();
                                            } else if (cVar.a() == 0) {
                                                i10 = 0;
                                            } else {
                                                i10 = -1;
                                            }
                                        }
                                    } else {
                                        i10 = cVar.a();
                                    }
                                    if (i10 != 11) {
                                    }
                                    return Integer.valueOf(i11);
                                }
                                i10 = 12;
                                if (i10 != 11) {
                                }
                                return Integer.valueOf(i11);
                            case 2:
                                switch (bVar.f27995p) {
                                    case 2:
                                        return System.getProperty("os.arch", "");
                                    default:
                                        return AbstractC4828h.m(Arrays.asList(bVar.f27996q.getAssets().getLocales()).toString());
                                }
                            case 3:
                                bVar.getClass();
                                return Integer.valueOf(Runtime.getRuntime().availableProcessors());
                            case 4:
                                bVar.getClass();
                                return H.f11528b.getString("gpuInfo", "");
                            case 5:
                                bVar.getClass();
                                ArrayList arrayList4 = new ArrayList();
                                StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
                                long blockSizeLong = statFs.getBlockSizeLong();
                                long blockCountLong = statFs.getBlockCountLong() * blockSizeLong;
                                arrayList4.add(Long.valueOf(statFs.getAvailableBlocksLong() * blockSizeLong));
                                arrayList4.add(Long.valueOf(blockCountLong));
                                if (Environment.isExternalStorageRemovable()) {
                                    StatFs statFs2 = new StatFs(Environment.getExternalStorageDirectory().getPath());
                                    long blockSizeLong2 = statFs2.getBlockSizeLong();
                                    long blockCountLong2 = statFs2.getBlockCountLong() * blockSizeLong2;
                                    arrayList4.add(Long.valueOf(statFs2.getAvailableBlocksLong() * blockSizeLong2));
                                    arrayList4.add(Long.valueOf(blockCountLong2));
                                }
                                return arrayList4;
                            case 6:
                                bVar.getClass();
                                StringBuilder sb2 = new StringBuilder();
                                int[] deviceIds = InputDevice.getDeviceIds();
                                if (deviceIds.length <= 0) {
                                    return "";
                                }
                                int length = deviceIds.length;
                                while (i13 < length) {
                                    InputDevice device = InputDevice.getDevice(deviceIds[i13]);
                                    sb2.append(device.getName() + Separators.COMMA + device.getVendorId() + Separators.SEMICOLON);
                                    i13++;
                                }
                                String str4 = deviceIds.length + Separators.POUND + sb2.toString();
                                return AbstractC4828h.m(str4.substring(str4.indexOf(Separators.POUND) + 1));
                            case 7:
                                StringBuilder sb3 = new StringBuilder();
                                List<Sensor> sensorList = ((SensorManager) bVar.f27996q.getSystemService("sensor")).getSensorList(-1);
                                if (sensorList.size() > 0) {
                                    while (i13 < sensorList.size()) {
                                        sb3.append(sensorList.get(i13).getName() + Separators.COMMA + sensorList.get(i13).getVendor() + Separators.SEMICOLON);
                                        i13++;
                                    }
                                    return AbstractC4828h.m(sb3.toString());
                                }
                                return null;
                            default:
                                CameraManager cameraManager = (CameraManager) bVar.f27996q.getSystemService("camera");
                                int i15 = 0;
                                int i16 = 0;
                                int i17 = 0;
                                for (String str5 : cameraManager.getCameraIdList()) {
                                    CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str5);
                                    CameraCharacteristics.Key key = CameraCharacteristics.LENS_FACING;
                                    if (((Integer) cameraCharacteristics.get(key)).intValue() == 0) {
                                        i17++;
                                    } else if (((Integer) cameraCharacteristics.get(key)).intValue() == 1) {
                                        i16++;
                                    } else {
                                        i15++;
                                    }
                                }
                                return new ArrayList(Arrays.asList(Integer.valueOf(i17), Integer.valueOf(i16), Integer.valueOf(i15)));
                        }
                    }
                });
                AbstractC4828h.n(arrayList3, "mobile_sdk__sensors_hash", new c(this) { // from class: d5.d

                    /* renamed from: Z  reason: collision with root package name */
                    public final /* synthetic */ b f27998Z;

                    {
                        this.f27998Z = this;
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:83:0x0253, code lost:
                        if (r2 != 1) goto L84;
                     */
                    /* JADX WARN: Removed duplicated region for block: B:76:0x0246  */
                    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, androidx.appcompat.view.a] */
                    @Override // d5.c
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object a() {
                        int i10;
                        int i11 = 2;
                        int i12 = r2;
                        int i13 = 0;
                        b bVar = this.f27998Z;
                        switch (i12) {
                            case 0:
                                bVar.getClass();
                                return new ArrayList(Arrays.asList(Build.SUPPORTED_ABIS));
                            case 1:
                                ?? obj = new Object();
                                Context applicationContext = bVar.f27996q.getApplicationContext();
                                obj.f24351a = applicationContext;
                                t.c cVar = new t.c(obj);
                                int i14 = Build.VERSION.SDK_INT;
                                BiometricManager biometricManager = cVar.f45603a;
                                if (i14 >= 30) {
                                    if (biometricManager == null) {
                                        AbstractC3612c.c("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
                                        i10 = 1;
                                        if (i10 != 11) {
                                            if (i10 != 12 && i10 != 15 && i10 != -2) {
                                                if (i10 != -1) {
                                                    if (i10 == 0) {
                                                        i11 = 3;
                                                    }
                                                }
                                                i11 = 0;
                                            }
                                            i11 = 1;
                                        }
                                        return Integer.valueOf(i11);
                                    }
                                    i10 = t.b.a(biometricManager, 255);
                                    if (i10 != 11) {
                                    }
                                    return Integer.valueOf(i11);
                                }
                                if (t.d.a(applicationContext) != null) {
                                    if (i14 == 29) {
                                        if (biometricManager == null) {
                                            AbstractC3612c.c("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
                                            i10 = 1;
                                        } else {
                                            i10 = t.a.a(biometricManager);
                                        }
                                    } else if (i14 == 28) {
                                        if (applicationContext != null && applicationContext.getPackageManager() != null && t.e.a(applicationContext.getPackageManager())) {
                                            KeyguardManager a5 = t.d.a(obj.f24351a);
                                            if (a5 == null || !t.d.b(a5)) {
                                                i10 = cVar.a();
                                            } else if (cVar.a() == 0) {
                                                i10 = 0;
                                            } else {
                                                i10 = -1;
                                            }
                                        }
                                    } else {
                                        i10 = cVar.a();
                                    }
                                    if (i10 != 11) {
                                    }
                                    return Integer.valueOf(i11);
                                }
                                i10 = 12;
                                if (i10 != 11) {
                                }
                                return Integer.valueOf(i11);
                            case 2:
                                switch (bVar.f27995p) {
                                    case 2:
                                        return System.getProperty("os.arch", "");
                                    default:
                                        return AbstractC4828h.m(Arrays.asList(bVar.f27996q.getAssets().getLocales()).toString());
                                }
                            case 3:
                                bVar.getClass();
                                return Integer.valueOf(Runtime.getRuntime().availableProcessors());
                            case 4:
                                bVar.getClass();
                                return H.f11528b.getString("gpuInfo", "");
                            case 5:
                                bVar.getClass();
                                ArrayList arrayList4 = new ArrayList();
                                StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
                                long blockSizeLong = statFs.getBlockSizeLong();
                                long blockCountLong = statFs.getBlockCountLong() * blockSizeLong;
                                arrayList4.add(Long.valueOf(statFs.getAvailableBlocksLong() * blockSizeLong));
                                arrayList4.add(Long.valueOf(blockCountLong));
                                if (Environment.isExternalStorageRemovable()) {
                                    StatFs statFs2 = new StatFs(Environment.getExternalStorageDirectory().getPath());
                                    long blockSizeLong2 = statFs2.getBlockSizeLong();
                                    long blockCountLong2 = statFs2.getBlockCountLong() * blockSizeLong2;
                                    arrayList4.add(Long.valueOf(statFs2.getAvailableBlocksLong() * blockSizeLong2));
                                    arrayList4.add(Long.valueOf(blockCountLong2));
                                }
                                return arrayList4;
                            case 6:
                                bVar.getClass();
                                StringBuilder sb2 = new StringBuilder();
                                int[] deviceIds = InputDevice.getDeviceIds();
                                if (deviceIds.length <= 0) {
                                    return "";
                                }
                                int length = deviceIds.length;
                                while (i13 < length) {
                                    InputDevice device = InputDevice.getDevice(deviceIds[i13]);
                                    sb2.append(device.getName() + Separators.COMMA + device.getVendorId() + Separators.SEMICOLON);
                                    i13++;
                                }
                                String str4 = deviceIds.length + Separators.POUND + sb2.toString();
                                return AbstractC4828h.m(str4.substring(str4.indexOf(Separators.POUND) + 1));
                            case 7:
                                StringBuilder sb3 = new StringBuilder();
                                List<Sensor> sensorList = ((SensorManager) bVar.f27996q.getSystemService("sensor")).getSensorList(-1);
                                if (sensorList.size() > 0) {
                                    while (i13 < sensorList.size()) {
                                        sb3.append(sensorList.get(i13).getName() + Separators.COMMA + sensorList.get(i13).getVendor() + Separators.SEMICOLON);
                                        i13++;
                                    }
                                    return AbstractC4828h.m(sb3.toString());
                                }
                                return null;
                            default:
                                CameraManager cameraManager = (CameraManager) bVar.f27996q.getSystemService("camera");
                                int i15 = 0;
                                int i16 = 0;
                                int i17 = 0;
                                for (String str5 : cameraManager.getCameraIdList()) {
                                    CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str5);
                                    CameraCharacteristics.Key key = CameraCharacteristics.LENS_FACING;
                                    if (((Integer) cameraCharacteristics.get(key)).intValue() == 0) {
                                        i17++;
                                    } else if (((Integer) cameraCharacteristics.get(key)).intValue() == 1) {
                                        i16++;
                                    } else {
                                        i15++;
                                    }
                                }
                                return new ArrayList(Arrays.asList(Integer.valueOf(i17), Integer.valueOf(i16), Integer.valueOf(i15)));
                        }
                    }
                });
                AbstractC4828h.n(arrayList3, "mobile_sdk__camera_lens_info", new c(this) { // from class: d5.d

                    /* renamed from: Z  reason: collision with root package name */
                    public final /* synthetic */ b f27998Z;

                    {
                        this.f27998Z = this;
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:83:0x0253, code lost:
                        if (r2 != 1) goto L84;
                     */
                    /* JADX WARN: Removed duplicated region for block: B:76:0x0246  */
                    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, androidx.appcompat.view.a] */
                    @Override // d5.c
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object a() {
                        int i10;
                        int i11 = 2;
                        int i12 = r2;
                        int i13 = 0;
                        b bVar = this.f27998Z;
                        switch (i12) {
                            case 0:
                                bVar.getClass();
                                return new ArrayList(Arrays.asList(Build.SUPPORTED_ABIS));
                            case 1:
                                ?? obj = new Object();
                                Context applicationContext = bVar.f27996q.getApplicationContext();
                                obj.f24351a = applicationContext;
                                t.c cVar = new t.c(obj);
                                int i14 = Build.VERSION.SDK_INT;
                                BiometricManager biometricManager = cVar.f45603a;
                                if (i14 >= 30) {
                                    if (biometricManager == null) {
                                        AbstractC3612c.c("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
                                        i10 = 1;
                                        if (i10 != 11) {
                                            if (i10 != 12 && i10 != 15 && i10 != -2) {
                                                if (i10 != -1) {
                                                    if (i10 == 0) {
                                                        i11 = 3;
                                                    }
                                                }
                                                i11 = 0;
                                            }
                                            i11 = 1;
                                        }
                                        return Integer.valueOf(i11);
                                    }
                                    i10 = t.b.a(biometricManager, 255);
                                    if (i10 != 11) {
                                    }
                                    return Integer.valueOf(i11);
                                }
                                if (t.d.a(applicationContext) != null) {
                                    if (i14 == 29) {
                                        if (biometricManager == null) {
                                            AbstractC3612c.c("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
                                            i10 = 1;
                                        } else {
                                            i10 = t.a.a(biometricManager);
                                        }
                                    } else if (i14 == 28) {
                                        if (applicationContext != null && applicationContext.getPackageManager() != null && t.e.a(applicationContext.getPackageManager())) {
                                            KeyguardManager a5 = t.d.a(obj.f24351a);
                                            if (a5 == null || !t.d.b(a5)) {
                                                i10 = cVar.a();
                                            } else if (cVar.a() == 0) {
                                                i10 = 0;
                                            } else {
                                                i10 = -1;
                                            }
                                        }
                                    } else {
                                        i10 = cVar.a();
                                    }
                                    if (i10 != 11) {
                                    }
                                    return Integer.valueOf(i11);
                                }
                                i10 = 12;
                                if (i10 != 11) {
                                }
                                return Integer.valueOf(i11);
                            case 2:
                                switch (bVar.f27995p) {
                                    case 2:
                                        return System.getProperty("os.arch", "");
                                    default:
                                        return AbstractC4828h.m(Arrays.asList(bVar.f27996q.getAssets().getLocales()).toString());
                                }
                            case 3:
                                bVar.getClass();
                                return Integer.valueOf(Runtime.getRuntime().availableProcessors());
                            case 4:
                                bVar.getClass();
                                return H.f11528b.getString("gpuInfo", "");
                            case 5:
                                bVar.getClass();
                                ArrayList arrayList4 = new ArrayList();
                                StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
                                long blockSizeLong = statFs.getBlockSizeLong();
                                long blockCountLong = statFs.getBlockCountLong() * blockSizeLong;
                                arrayList4.add(Long.valueOf(statFs.getAvailableBlocksLong() * blockSizeLong));
                                arrayList4.add(Long.valueOf(blockCountLong));
                                if (Environment.isExternalStorageRemovable()) {
                                    StatFs statFs2 = new StatFs(Environment.getExternalStorageDirectory().getPath());
                                    long blockSizeLong2 = statFs2.getBlockSizeLong();
                                    long blockCountLong2 = statFs2.getBlockCountLong() * blockSizeLong2;
                                    arrayList4.add(Long.valueOf(statFs2.getAvailableBlocksLong() * blockSizeLong2));
                                    arrayList4.add(Long.valueOf(blockCountLong2));
                                }
                                return arrayList4;
                            case 6:
                                bVar.getClass();
                                StringBuilder sb2 = new StringBuilder();
                                int[] deviceIds = InputDevice.getDeviceIds();
                                if (deviceIds.length <= 0) {
                                    return "";
                                }
                                int length = deviceIds.length;
                                while (i13 < length) {
                                    InputDevice device = InputDevice.getDevice(deviceIds[i13]);
                                    sb2.append(device.getName() + Separators.COMMA + device.getVendorId() + Separators.SEMICOLON);
                                    i13++;
                                }
                                String str4 = deviceIds.length + Separators.POUND + sb2.toString();
                                return AbstractC4828h.m(str4.substring(str4.indexOf(Separators.POUND) + 1));
                            case 7:
                                StringBuilder sb3 = new StringBuilder();
                                List<Sensor> sensorList = ((SensorManager) bVar.f27996q.getSystemService("sensor")).getSensorList(-1);
                                if (sensorList.size() > 0) {
                                    while (i13 < sensorList.size()) {
                                        sb3.append(sensorList.get(i13).getName() + Separators.COMMA + sensorList.get(i13).getVendor() + Separators.SEMICOLON);
                                        i13++;
                                    }
                                    return AbstractC4828h.m(sb3.toString());
                                }
                                return null;
                            default:
                                CameraManager cameraManager = (CameraManager) bVar.f27996q.getSystemService("camera");
                                int i15 = 0;
                                int i16 = 0;
                                int i17 = 0;
                                for (String str5 : cameraManager.getCameraIdList()) {
                                    CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str5);
                                    CameraCharacteristics.Key key = CameraCharacteristics.LENS_FACING;
                                    if (((Integer) cameraCharacteristics.get(key)).intValue() == 0) {
                                        i17++;
                                    } else if (((Integer) cameraCharacteristics.get(key)).intValue() == 1) {
                                        i16++;
                                    } else {
                                        i15++;
                                    }
                                }
                                return new ArrayList(Arrays.asList(Integer.valueOf(i17), Integer.valueOf(i16), Integer.valueOf(i15)));
                        }
                    }
                });
                AbstractC4828h.n(arrayList3, "mobile_sdk__bio_fingerprint", new c(this) { // from class: d5.d

                    /* renamed from: Z  reason: collision with root package name */
                    public final /* synthetic */ b f27998Z;

                    {
                        this.f27998Z = this;
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:83:0x0253, code lost:
                        if (r2 != 1) goto L84;
                     */
                    /* JADX WARN: Removed duplicated region for block: B:76:0x0246  */
                    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, androidx.appcompat.view.a] */
                    @Override // d5.c
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object a() {
                        int i10;
                        int i11 = 2;
                        int i12 = r2;
                        int i13 = 0;
                        b bVar = this.f27998Z;
                        switch (i12) {
                            case 0:
                                bVar.getClass();
                                return new ArrayList(Arrays.asList(Build.SUPPORTED_ABIS));
                            case 1:
                                ?? obj = new Object();
                                Context applicationContext = bVar.f27996q.getApplicationContext();
                                obj.f24351a = applicationContext;
                                t.c cVar = new t.c(obj);
                                int i14 = Build.VERSION.SDK_INT;
                                BiometricManager biometricManager = cVar.f45603a;
                                if (i14 >= 30) {
                                    if (biometricManager == null) {
                                        AbstractC3612c.c("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
                                        i10 = 1;
                                        if (i10 != 11) {
                                            if (i10 != 12 && i10 != 15 && i10 != -2) {
                                                if (i10 != -1) {
                                                    if (i10 == 0) {
                                                        i11 = 3;
                                                    }
                                                }
                                                i11 = 0;
                                            }
                                            i11 = 1;
                                        }
                                        return Integer.valueOf(i11);
                                    }
                                    i10 = t.b.a(biometricManager, 255);
                                    if (i10 != 11) {
                                    }
                                    return Integer.valueOf(i11);
                                }
                                if (t.d.a(applicationContext) != null) {
                                    if (i14 == 29) {
                                        if (biometricManager == null) {
                                            AbstractC3612c.c("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
                                            i10 = 1;
                                        } else {
                                            i10 = t.a.a(biometricManager);
                                        }
                                    } else if (i14 == 28) {
                                        if (applicationContext != null && applicationContext.getPackageManager() != null && t.e.a(applicationContext.getPackageManager())) {
                                            KeyguardManager a5 = t.d.a(obj.f24351a);
                                            if (a5 == null || !t.d.b(a5)) {
                                                i10 = cVar.a();
                                            } else if (cVar.a() == 0) {
                                                i10 = 0;
                                            } else {
                                                i10 = -1;
                                            }
                                        }
                                    } else {
                                        i10 = cVar.a();
                                    }
                                    if (i10 != 11) {
                                    }
                                    return Integer.valueOf(i11);
                                }
                                i10 = 12;
                                if (i10 != 11) {
                                }
                                return Integer.valueOf(i11);
                            case 2:
                                switch (bVar.f27995p) {
                                    case 2:
                                        return System.getProperty("os.arch", "");
                                    default:
                                        return AbstractC4828h.m(Arrays.asList(bVar.f27996q.getAssets().getLocales()).toString());
                                }
                            case 3:
                                bVar.getClass();
                                return Integer.valueOf(Runtime.getRuntime().availableProcessors());
                            case 4:
                                bVar.getClass();
                                return H.f11528b.getString("gpuInfo", "");
                            case 5:
                                bVar.getClass();
                                ArrayList arrayList4 = new ArrayList();
                                StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
                                long blockSizeLong = statFs.getBlockSizeLong();
                                long blockCountLong = statFs.getBlockCountLong() * blockSizeLong;
                                arrayList4.add(Long.valueOf(statFs.getAvailableBlocksLong() * blockSizeLong));
                                arrayList4.add(Long.valueOf(blockCountLong));
                                if (Environment.isExternalStorageRemovable()) {
                                    StatFs statFs2 = new StatFs(Environment.getExternalStorageDirectory().getPath());
                                    long blockSizeLong2 = statFs2.getBlockSizeLong();
                                    long blockCountLong2 = statFs2.getBlockCountLong() * blockSizeLong2;
                                    arrayList4.add(Long.valueOf(statFs2.getAvailableBlocksLong() * blockSizeLong2));
                                    arrayList4.add(Long.valueOf(blockCountLong2));
                                }
                                return arrayList4;
                            case 6:
                                bVar.getClass();
                                StringBuilder sb2 = new StringBuilder();
                                int[] deviceIds = InputDevice.getDeviceIds();
                                if (deviceIds.length <= 0) {
                                    return "";
                                }
                                int length = deviceIds.length;
                                while (i13 < length) {
                                    InputDevice device = InputDevice.getDevice(deviceIds[i13]);
                                    sb2.append(device.getName() + Separators.COMMA + device.getVendorId() + Separators.SEMICOLON);
                                    i13++;
                                }
                                String str4 = deviceIds.length + Separators.POUND + sb2.toString();
                                return AbstractC4828h.m(str4.substring(str4.indexOf(Separators.POUND) + 1));
                            case 7:
                                StringBuilder sb3 = new StringBuilder();
                                List<Sensor> sensorList = ((SensorManager) bVar.f27996q.getSystemService("sensor")).getSensorList(-1);
                                if (sensorList.size() > 0) {
                                    while (i13 < sensorList.size()) {
                                        sb3.append(sensorList.get(i13).getName() + Separators.COMMA + sensorList.get(i13).getVendor() + Separators.SEMICOLON);
                                        i13++;
                                    }
                                    return AbstractC4828h.m(sb3.toString());
                                }
                                return null;
                            default:
                                CameraManager cameraManager = (CameraManager) bVar.f27996q.getSystemService("camera");
                                int i15 = 0;
                                int i16 = 0;
                                int i17 = 0;
                                for (String str5 : cameraManager.getCameraIdList()) {
                                    CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str5);
                                    CameraCharacteristics.Key key = CameraCharacteristics.LENS_FACING;
                                    if (((Integer) cameraCharacteristics.get(key)).intValue() == 0) {
                                        i17++;
                                    } else if (((Integer) cameraCharacteristics.get(key)).intValue() == 1) {
                                        i16++;
                                    } else {
                                        i15++;
                                    }
                                }
                                return new ArrayList(Arrays.asList(Integer.valueOf(i17), Integer.valueOf(i16), Integer.valueOf(i15)));
                        }
                    }
                });
                Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                int intExtra = registerReceiver.getIntExtra("status", -1);
                if (intExtra != 1) {
                    if (intExtra != 2) {
                        if (intExtra != 3) {
                            if (intExtra != 4) {
                                if (intExtra != 5) {
                                    str = "Undefined";
                                } else {
                                    str = "Full";
                                }
                            } else {
                                str = "Unplugged";
                            }
                        } else {
                            str = "Discharging";
                        }
                    } else {
                        int intExtra2 = registerReceiver.getIntExtra("plugged", -1);
                        if (intExtra2 != 1) {
                            if (intExtra2 != 2) {
                                if (intExtra2 != 4) {
                                    str = "";
                                } else {
                                    str = android.gov.nist.core.a.D(1) + Separators.SP + android.gov.nist.core.a.C(3);
                                }
                            } else {
                                str = android.gov.nist.core.a.D(1) + Separators.SP + android.gov.nist.core.a.C(1);
                            }
                        } else {
                            str = android.gov.nist.core.a.D(1) + Separators.SP + android.gov.nist.core.a.C(2);
                        }
                    }
                } else {
                    str = "Unknown";
                }
                Pair pair2 = new Pair(str, Integer.valueOf(((BatteryManager) context.getSystemService("batterymanager")).getIntProperty(4)));
                arrayList3.add(new f("mobile_sdk__battery_status", (String) pair2.first));
                arrayList3.add(new f("mobile_sdk__battery_capacity", (Integer) pair2.second));
                return arrayList3;
            case 3:
                ArrayList arrayList4 = new ArrayList();
                C2937a.d("IdInformation", "Collecting signals", new Throwable[0]);
                AbstractC4828h.n(arrayList4, "mobile_sdk__id_for_vendor", new C3276b(21, this));
                return arrayList4;
            default:
                ArrayList arrayList5 = new ArrayList();
                C2937a.d("PersonalSettings", "Collecting signals", new Throwable[0]);
                AbstractC4828h.n(arrayList5, "mobile_sdk__locale_hash", new c(this) { // from class: d5.e

                    /* renamed from: Z  reason: collision with root package name */
                    public final /* synthetic */ b f28000Z;

                    {
                        this.f28000Z = this;
                    }

                    @Override // d5.c
                    public final Object a() {
                        int i10 = r2;
                        b bVar = this.f28000Z;
                        switch (i10) {
                            case 0:
                                switch (bVar.f27995p) {
                                    case 2:
                                        return System.getProperty("os.arch", "");
                                    default:
                                        return AbstractC4828h.m(Arrays.asList(bVar.f27996q.getAssets().getLocales()).toString());
                                }
                            case 1:
                                return bVar.w0();
                            case 2:
                                bVar.getClass();
                                return Locale.getDefault().getLanguage();
                            case 3:
                                bVar.getClass();
                                return Integer.valueOf(TimeZone.getDefault().getOffset(new Date().getTime()) / 60000);
                            case 4:
                                return bVar.x0();
                            default:
                                return Integer.valueOf((Settings.System.getInt(bVar.f27996q.getContentResolver(), "screen_brightness", -1) * 100) / 255);
                        }
                    }
                });
                AbstractC4828h.n(arrayList5, "mobile_sdk__country_region", new c(this) { // from class: d5.e

                    /* renamed from: Z  reason: collision with root package name */
                    public final /* synthetic */ b f28000Z;

                    {
                        this.f28000Z = this;
                    }

                    @Override // d5.c
                    public final Object a() {
                        int i10 = r2;
                        b bVar = this.f28000Z;
                        switch (i10) {
                            case 0:
                                switch (bVar.f27995p) {
                                    case 2:
                                        return System.getProperty("os.arch", "");
                                    default:
                                        return AbstractC4828h.m(Arrays.asList(bVar.f27996q.getAssets().getLocales()).toString());
                                }
                            case 1:
                                return bVar.w0();
                            case 2:
                                bVar.getClass();
                                return Locale.getDefault().getLanguage();
                            case 3:
                                bVar.getClass();
                                return Integer.valueOf(TimeZone.getDefault().getOffset(new Date().getTime()) / 60000);
                            case 4:
                                return bVar.x0();
                            default:
                                return Integer.valueOf((Settings.System.getInt(bVar.f27996q.getContentResolver(), "screen_brightness", -1) * 100) / 255);
                        }
                    }
                });
                AbstractC4828h.n(arrayList5, "mobile_sdk__language", new c(this) { // from class: d5.e

                    /* renamed from: Z  reason: collision with root package name */
                    public final /* synthetic */ b f28000Z;

                    {
                        this.f28000Z = this;
                    }

                    @Override // d5.c
                    public final Object a() {
                        int i10 = r2;
                        b bVar = this.f28000Z;
                        switch (i10) {
                            case 0:
                                switch (bVar.f27995p) {
                                    case 2:
                                        return System.getProperty("os.arch", "");
                                    default:
                                        return AbstractC4828h.m(Arrays.asList(bVar.f27996q.getAssets().getLocales()).toString());
                                }
                            case 1:
                                return bVar.w0();
                            case 2:
                                bVar.getClass();
                                return Locale.getDefault().getLanguage();
                            case 3:
                                bVar.getClass();
                                return Integer.valueOf(TimeZone.getDefault().getOffset(new Date().getTime()) / 60000);
                            case 4:
                                return bVar.x0();
                            default:
                                return Integer.valueOf((Settings.System.getInt(bVar.f27996q.getContentResolver(), "screen_brightness", -1) * 100) / 255);
                        }
                    }
                });
                AbstractC4828h.n(arrayList5, "mobile_sdk__timezone_offset", new c(this) { // from class: d5.e

                    /* renamed from: Z  reason: collision with root package name */
                    public final /* synthetic */ b f28000Z;

                    {
                        this.f28000Z = this;
                    }

                    @Override // d5.c
                    public final Object a() {
                        int i10 = r2;
                        b bVar = this.f28000Z;
                        switch (i10) {
                            case 0:
                                switch (bVar.f27995p) {
                                    case 2:
                                        return System.getProperty("os.arch", "");
                                    default:
                                        return AbstractC4828h.m(Arrays.asList(bVar.f27996q.getAssets().getLocales()).toString());
                                }
                            case 1:
                                return bVar.w0();
                            case 2:
                                bVar.getClass();
                                return Locale.getDefault().getLanguage();
                            case 3:
                                bVar.getClass();
                                return Integer.valueOf(TimeZone.getDefault().getOffset(new Date().getTime()) / 60000);
                            case 4:
                                return bVar.x0();
                            default:
                                return Integer.valueOf((Settings.System.getInt(bVar.f27996q.getContentResolver(), "screen_brightness", -1) * 100) / 255);
                        }
                    }
                });
                AbstractC4828h.n(arrayList5, "mobile_sdk__device_name", new c(this) { // from class: d5.e

                    /* renamed from: Z  reason: collision with root package name */
                    public final /* synthetic */ b f28000Z;

                    {
                        this.f28000Z = this;
                    }

                    @Override // d5.c
                    public final Object a() {
                        int i10 = r2;
                        b bVar = this.f28000Z;
                        switch (i10) {
                            case 0:
                                switch (bVar.f27995p) {
                                    case 2:
                                        return System.getProperty("os.arch", "");
                                    default:
                                        return AbstractC4828h.m(Arrays.asList(bVar.f27996q.getAssets().getLocales()).toString());
                                }
                            case 1:
                                return bVar.w0();
                            case 2:
                                bVar.getClass();
                                return Locale.getDefault().getLanguage();
                            case 3:
                                bVar.getClass();
                                return Integer.valueOf(TimeZone.getDefault().getOffset(new Date().getTime()) / 60000);
                            case 4:
                                return bVar.x0();
                            default:
                                return Integer.valueOf((Settings.System.getInt(bVar.f27996q.getContentResolver(), "screen_brightness", -1) * 100) / 255);
                        }
                    }
                });
                AbstractC4828h.n(arrayList5, "mobile_sdk__screen_brightness", new c(this) { // from class: d5.e

                    /* renamed from: Z  reason: collision with root package name */
                    public final /* synthetic */ b f28000Z;

                    {
                        this.f28000Z = this;
                    }

                    @Override // d5.c
                    public final Object a() {
                        int i10 = r2;
                        b bVar = this.f28000Z;
                        switch (i10) {
                            case 0:
                                switch (bVar.f27995p) {
                                    case 2:
                                        return System.getProperty("os.arch", "");
                                    default:
                                        return AbstractC4828h.m(Arrays.asList(bVar.f27996q.getAssets().getLocales()).toString());
                                }
                            case 1:
                                return bVar.w0();
                            case 2:
                                bVar.getClass();
                                return Locale.getDefault().getLanguage();
                            case 3:
                                bVar.getClass();
                                return Integer.valueOf(TimeZone.getDefault().getOffset(new Date().getTime()) / 60000);
                            case 4:
                                return bVar.x0();
                            default:
                                return Integer.valueOf((Settings.System.getInt(bVar.f27996q.getContentResolver(), "screen_brightness", -1) * 100) / 255);
                        }
                    }
                });
                return arrayList5;
        }
    }

    public final String w0() {
        Context context = this.f27996q;
        switch (this.f27995p) {
            case 0:
                return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).packageName;
            case 1:
                int rotation = ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
                if (rotation != 0) {
                    if (rotation != 1) {
                        if (rotation != 2) {
                            if (rotation != 3) {
                                return "Un";
                            }
                            return "LR";
                        }
                        return "PU";
                    }
                    return "LL";
                }
                return "P";
            case 2:
            default:
                return context.getResources().getConfiguration().locale.getCountry();
            case 3:
                if (Build.VERSION.SDK_INT >= 26) {
                    return Settings.Secure.getString(context.getContentResolver(), "android_id");
                }
                return "-1";
        }
    }

    public final String x0() {
        Context context = this.f27996q;
        switch (this.f27995p) {
            case 0:
                StringBuilder sb2 = new StringBuilder();
                for (Signature signature : context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures) {
                    sb2.append(new String(signature.toByteArray()));
                }
                return AbstractC4828h.m(sb2.toString());
            default:
                return AbstractC4828h.m(Settings.Global.getString(context.getContentResolver(), "device_name"));
        }
    }
}
