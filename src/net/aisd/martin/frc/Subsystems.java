
package net.aisd.martin.frc;

import net.aisd.martin.frc.subsystems.*;

/**
 * Container class for Subsystems that we use.
 * Unless otherwise specified, each subsystem is constructed using its default
 * constructor.
 * @author Col32
 */
public final class Subsystems
{
	private Subsystems() {}

	/**
	 * DriveSystem subsystem.
	 */
	public static DriveSystem drivesystem;

	/**
	 * JoystickSystem subsystem.
	 */
	public static JoystickSystem joysticksystem;
        
        /**
         * ShooterSystem subsystem
         */
        public static ShooterSystem shootersystem;

	/**
	 * This function initializes all of the subsystems.
         * Neil Manning: Added ShooterSystem initialization
	 */
	public static void init()
	{
		drivesystem = new DriveSystem();
		joysticksystem = new JoystickSystem();
                shootersystem = new ShooterSystem();
	}
}
