package com.pairip.licensecheck3;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.android.vending.licensing.ILicenseV2ResultListener;
import com.android.vending.licensing.ILicensingService;

/* loaded from: classes.dex */
public class LicenseClientV3 implements ServiceConnection {
    private static final int ERROR_INVALID_PACKAGE_NAME = 3;
    private static final int FLAG_RPC_CALL = 0;
    private static final int LICENSED = 0;
    private static final int MAX_RETRIES = 3;
    private static final int MILLIS_PER_SEC = 1000;
    private static final int NOT_LICENSED = 2;
    private static final String PAYLOAD_PAYWALL = "PAYWALL_INTENT";
    private static final int RETRY_DELAY_MILLIS = 1000;
    private static final String SERVICE_PACKAGE = "com.android.vending";
    private static final String TAG = "LicenseClientV3";
    private static final int TRANSACTION_CHECK_LICENSE_V2 = 2;
    public static LicenseCheckState licenseCheckState = LicenseCheckState.CHECK_REQUIRED;
    public static String licensePubKey = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAqk+EUw2PtAt9Hn5kGVMRxAg1kh8wMCpqKPoNcuhuPput5oTeNpZFYF9isi6z8WtZUq+6DPPtr4sEb0r860doasXhMtTrP/fSdFdAnYYxhJiuJEvV4f0iRxCiOR6I3V/30EFWyQCtmUZMu0pO5z6z+CKdgRfn3t9kQTYrJayv71s1XpWNov1mxrDG0df4X+73WjVWB6R4QcsZ1T0rgUlNe39R70qLWlRrE8rBAAcaQEbFjGmSFPzbNRnBtMEe8mSWcetWF0vhyXuh15f2mm4QDy2tFVO3LCYbrLsckZwCvae3VXT57bSSSzXRD8H61iUFA3pbhZ2sMy/hMC5kgAVnEQIDAQAB";
    public static String packageName = "com.openai.chatgpt";
    private static Bundle responsePayload;
    private final Activity activity;
    private final DelayedTaskExecutor delayedTaskExecutor = new DelayedTaskExecutor();
    private int retryNum = 0;

    /* loaded from: classes.dex */
    public enum LicenseCheckState {
        CHECK_REQUIRED,
        OK
    }

    public static void onActivityCreate(Activity activity) {
        new LicenseClientV3(activity).initializeLicenseCheck();
    }

    public LicenseClientV3(Activity activity) {
        this.activity = activity;
    }

    private void initializeLicenseCheck() {
        int ordinal = licenseCheckState.ordinal();
        if (ordinal == 0) {
            connectToLicensingService();
        } else if (ordinal != 1) {
        } else {
            try {
                ResponseValidator.validateResponse(responsePayload, packageName);
            } catch (LicenseCheckException e10) {
                handleError(e10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void connectToLicensingService() {
        Log.d(TAG, "Connecting to the licensing service...");
        try {
            if (this.activity.getApplicationContext().bindService(new Intent(ILicensingService.class.getName()).setPackage("com.android.vending").setAction(ILicensingService.class.getName()), this, 1)) {
                return;
            }
            retryOrThrow(new LicenseCheckException("Could not bind with the licensing service."));
        } catch (SecurityException e10) {
            retryOrThrow(new LicenseCheckException("Not allowed to bind with the licensing service.", e10));
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, final IBinder licensingServiceBinder) {
        Log.d(TAG, "Connected to the licensing service.");
        if (licenseCheckState.equals(LicenseCheckState.OK)) {
            return;
        }
        new Thread(new Runnable() { // from class: com.pairip.licensecheck3.LicenseClientV3$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                LicenseClientV3.this.m51x21e28f90(licensingServiceBinder);
            }
        }).start();
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        Log.w(TAG, "Unexpectedly disconnected from the licensing service.");
        retryOrThrow(new LicenseCheckException("Licensing service unexpectedly disconnected."));
    }

    /* renamed from: checkLicenseInternal */
    public void m51x21e28f90(IBinder licensingServiceBinder) {
        if (licensingServiceBinder == null) {
            retryOrThrow(new LicenseCheckException("Received a null binder."));
            return;
        }
        Log.d(TAG, "Sending request to licensing service...");
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            try {
                populateInputData(obtain, licensingServiceBinder);
                if (!licensingServiceBinder.transact(2, obtain, obtain2, 0)) {
                    handleError(new LicenseCheckException("Licensing service could not process request."));
                }
            } catch (DeadObjectException e10) {
                retryOrThrow(new LicenseCheckException("Licensing service process died.", e10));
            } catch (RemoteException e11) {
                handleError(new LicenseCheckException("Error when calling licensing service.", e11));
            }
        } finally {
            obtain.recycle();
            obtain2.recycle();
            Log.d(TAG, "Request to licensing service sent.");
        }
    }

    private void populateInputData(Parcel inputData, IBinder licensingService) throws RemoteException {
        inputData.writeInterfaceToken(licensingService.getInterfaceDescriptor());
        inputData.writeString(packageName);
        inputData.writeStrongBinder(createResultListener(this).asBinder());
        inputData.writeInt(0);
    }

    private static ILicenseV2ResultListener createResultListener(LicenseClientV3 client) {
        return new ILicenseV2ResultListener.Stub() { // from class: com.pairip.licensecheck3.LicenseClientV3.1
            @Override // com.android.vending.licensing.ILicenseV2ResultListener
            public void verifyLicense(int responseCode, Bundle responsePayload2) {
                LicenseClientV3.this.processResponse(responseCode, responsePayload2);
            }
        };
    }

    private void retryOrThrow(LicenseCheckException error) {
        int i10 = this.retryNum;
        if (i10 < 3) {
            this.retryNum = i10 + 1;
            this.delayedTaskExecutor.schedule(new Runnable() { // from class: com.pairip.licensecheck3.LicenseClientV3$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    LicenseClientV3.this.connectToLicensingService();
                }
            }, 1000L);
            Log.d(TAG, String.format("Retry #%d. License check failed with error '%s'. Next try in %ds...", Integer.valueOf(this.retryNum), error.getMessage(), 1L));
            return;
        }
        handleError(error);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processResponse(int responseCode, Bundle responsePayload2) {
        try {
            if (responseCode == 3) {
                throw new LicenseCheckException("Request package name invalid.");
            }
            if (responseCode != 0) {
                if (responseCode == 2) {
                    showPaywall((PendingIntent) responsePayload2.getParcelable(PAYLOAD_PAYWALL));
                    return;
                }
                throw new LicenseCheckException(String.format("Unexpected response code %d received.", Integer.valueOf(responseCode)));
            }
            ResponseValidator.validateResponse(responsePayload2, packageName);
            Log.i(TAG, "License check succeeded.");
            licenseCheckState = LicenseCheckState.OK;
            responsePayload = responsePayload2;
        } catch (LicenseCheckException e10) {
            handleError(e10);
        }
    }

    private void handleError(LicenseCheckException ex) {
        String stackTraceString = Log.getStackTraceString(ex);
        Log.e(TAG, "Error while checking license: " + stackTraceString);
        if (licenseCheckState.equals(LicenseCheckState.OK)) {
            return;
        }
        showErrorDialog();
    }

    private void showErrorDialog() {
        licenseCheckState = LicenseCheckState.CHECK_REQUIRED;
        this.activity.runOnUiThread(new Runnable() { // from class: com.pairip.licensecheck3.LicenseClientV3$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                LicenseClientV3.this.m53x91ba8288();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$showErrorDialog$2$com-pairip-licensecheck3-LicenseClientV3  reason: not valid java name */
    public /* synthetic */ void m53x91ba8288() {
        try {
            new AlertDialog.Builder(this.activity).setTitle("Something went wrong").setMessage("Check that Google Play is enabled on your device and that you're using an up-to-date version before opening the app. If the problem persists try reinstalling the app.").setPositiveButton("Close", new DialogInterface.OnClickListener() { // from class: com.pairip.licensecheck3.LicenseClientV3$$ExternalSyntheticLambda2
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    LicenseClientV3.this.m52x8a554d69(dialogInterface, i10);
                }
            }).setCancelable(false).show();
        } catch (RuntimeException e10) {
            String stackTraceString = Log.getStackTraceString(e10);
            Log.d(TAG, "Couldn't show the error dialog. " + stackTraceString);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$showErrorDialog$1$com-pairip-licensecheck3-LicenseClientV3  reason: not valid java name */
    public /* synthetic */ void m52x8a554d69(DialogInterface dialogInterface, int i10) {
        onDialogExitClick();
    }

    private void onDialogExitClick() {
        this.activity.finishAndRemoveTask();
    }

    private void showPaywall(final PendingIntent paywallIntent) {
        if (paywallIntent == null) {
            handleError(new LicenseCheckException("Paywall intent is null."));
            return;
        }
        licenseCheckState = LicenseCheckState.CHECK_REQUIRED;
        this.activity.runOnUiThread(new Runnable() { // from class: com.pairip.licensecheck3.LicenseClientV3$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                LicenseClientV3.this.m54lambda$showPaywall$3$compairiplicensecheck3LicenseClientV3(paywallIntent);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$showPaywall$3$com-pairip-licensecheck3-LicenseClientV3  reason: not valid java name */
    public /* synthetic */ void m54lambda$showPaywall$3$compairiplicensecheck3LicenseClientV3(PendingIntent pendingIntent) {
        try {
            pendingIntent.send();
            this.activity.finishAndRemoveTask();
        } catch (PendingIntent.CanceledException e10) {
            handleError(new LicenseCheckException("Paywall intent unexpectedly cancelled.", e10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static final class DelayedTaskExecutor {
        private final Handler handler;

        private DelayedTaskExecutor() {
            this.handler = new Handler(Looper.getMainLooper());
        }

        public void schedule(Runnable task, long delayMillis) {
            this.handler.postDelayed(task, delayMillis);
        }
    }

    /* loaded from: classes2.dex */
    public static final class LicenseCheckException extends Exception {
        public LicenseCheckException(String message) {
            super(message);
        }

        public LicenseCheckException(String message, Throwable cause) {
            super(message, cause);
        }
    }
}
